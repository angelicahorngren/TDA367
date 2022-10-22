package Model;

import java.util.ArrayList;
import java.util.Iterator;

public class CollisionDetector {

    private Player player;
    private ArrayList<Obstacle> levelOne;
    private PowerUp powerUp;
    private ArrayList<Projectile> projectiles;



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
        Iterator<Obstacle> iterationObstacle = levelOne.iterator();
        Iterator<Projectile> iterationProjectile = projectiles.iterator();
        while (iterationObstacle.hasNext() && iterationProjectile.hasNext()) {
            Obstacle obstacle = iterationObstacle.next();
            Projectile projectile = iterationProjectile.next();
            if(
                    (projectile.getxPosition() + projectile.getWidth() >= obstacle.getxPosition()) &&
                            (projectile.getxPosition() <= obstacle.getxPosition() + obstacle.width) &&
                            (projectile.getyPosition() + projectile.getWidth() >= obstacle.getyPosition()) &&
                            (projectile.getyPosition() <= obstacle.getyPosition() + obstacle.height)
            )
            {
                iterationObstacle.remove();
                iterationProjectile.remove();
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
            //System.out.println("u got power");
        }
    }


    public void runCollisionDetectorSystem(){
        detectPlayerObstacleCollision();
        detectProjectileObstacleCollision();
        detectCollisionPowerUpObject();
    }



}
