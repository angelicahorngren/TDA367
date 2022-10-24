package Model;

import java.util.ArrayList;
import java.util.Iterator;

public class CollisionDetector {

    private Player player;
    private ArrayList<Obstacle> levelOne;
    private PowerUp powerUp;
    private ArrayList<Projectile> projectiles;

    /**
     * A constructor for CollisionDetector
     * This is used in the gameloop to continuously check for collisions between the player/objects, the projectile/objects and the player/powerup and take appropriate measures.
     * @param player used to check collisions with the player.
     * @param levelOne used to check for collisions with each of the obstacles in level one.
     * @param projectiles used to check for collisions with the projectiles.
     * @param powerUp used to check for collisions with the power ups.
     */
    public CollisionDetector(Player player, ArrayList<Obstacle> levelOne, ArrayList<Projectile> projectiles, PowerUp powerUp){
        this.player = player;
        this.levelOne = levelOne;
        this.powerUp = powerUp;
        this.projectiles = projectiles;
    }

    private void detectPlayerObstacleCollision(){
        for(Obstacle obstacle : levelOne)
        if(
            (player.getxPosition() + player.getPlayerWidth() >= obstacle.getxPosition()) &&
            (player.getxPosition() <= obstacle.getxPosition() + obstacle.width) &&
            (player.getyPosition() + player.getPlayerWidth() >= obstacle.getyPosition()) &&
            (player.getyPosition() <= obstacle.getyPosition() + obstacle.height)
                    && !powerUp.getPowerUpStatus()
        )
        {
            player.setPlayerNotAlive();

        }

    }

    private void detectProjectileObstacleCollision() {
        for (Obstacle obstacle : levelOne) {
            for (Projectile projectile : projectiles) {
                if (
                        (projectile.getxPosition() + projectile.getWidth() >= obstacle.getxPosition()) &&
                                (projectile.getxPosition() <= obstacle.getxPosition() + obstacle.width) &&
                                (projectile.getyPosition() + projectile.getWidth() >= obstacle.getyPosition()) &&
                                (projectile.getyPosition() <= obstacle.getyPosition() + obstacle.height)
                ) {
                    projectile.yPosition = 1000;
                    if(obstacle.isDestroyable){
                        obstacle.yPosition = 1000;
                    }
                }
            }
        }
    }



    private void detectCollisionPowerUpObject(){
        if(
                (player.getxPosition() + player.getPlayerWidth() >= powerUp.getxPosition()) &&
                        (player.getxPosition() <= powerUp.getxPosition() + powerUp.getWidth()) &&
                        (player.getyPosition() + player.getPlayerHeight() >= powerUp.getyPosition()) &&
                        (player.getyPosition() <= powerUp.getyPosition() + powerUp.getHeight())
        )
        {
            powerUp.setPowerUpOn();
        }
    }

    /**
     * Runs all 3 collision detection methods:
     * If the player collides with an obstacle the player will be set to not alive which will stop the game and switch to LostRoundMenu.
     * If a projectile collides with an obstacle both the projectile and the obstacle will be removed from the level.
     * If the player collides with a PowerUp object the player's PowerUp -status gets set to on.
     */
    public void runCollisionDetectorSystem(){
        detectPlayerObstacleCollision();
        detectProjectileObstacleCollision();
        detectCollisionPowerUpObject();
    }

}
