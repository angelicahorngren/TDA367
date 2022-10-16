package Model;

public class CollisionDetector {

    Player player;
    Obstacle obstacle;
    LevelOne levelOne;
    PowerUp powerUp;


    public Boolean collided;



    public CollisionDetector(Player player, Obstacle obstacle, LevelOne levelOne, PowerUp powerUp){
        this.levelOne = levelOne;
        this.player = player;
        this.obstacle = obstacle;
        this.powerUp = powerUp;
        this.collided = false;
    }


    public void detectCollision(){
        if(
            (player.getxPosition() + player.playerWidth >= obstacle.getxPosition()) &&
            (player.getxPosition() <= obstacle.getxPosition() + obstacle.width) &&
            (player.getyPosition() + player.playerHeight >= obstacle.getyPosition()) &&
            (player.getyPosition() <= obstacle.getyPosition() + obstacle.height)
        )
        {
            player.setPlayerNotAlive();

            System.out.println("Player x : " + player.getxPosition() + " Player y : " + player.getyPosition());
            System.out.println("Obstacle x : " + obstacle.getxPosition() + " Obstacle y : " + obstacle.getyPosition());
            System.out.println("alive status : " + player.alive);

            /*if(obstacle.isDestroyable){
                levelOne.remove(obstacle);
            }

             */
            player.alive = false;
        }
    }


    public void detectCollisionPowerUpObject(){
        if(
                (player.getxPosition() + player.playerWidth >= powerUp.getxPosition()) &&
                        (player.getxPosition() <= powerUp.getxPosition() + powerUp.width) &&
                        (player.getyPosition() + player.playerHeight >= powerUp.getyPosition()) &&
                        (player.getyPosition() <= powerUp.getyPosition() + powerUp.height)
        )
        {
            powerUp.isPowerOn();
            System.out.println("Player x : " + player.getxPosition() + " Player y : " + player.getyPosition());
            System.out.println("powerUp x : " + powerUp.getxPosition() + " powerUp y : " + powerUp.getyPosition());
            System.out.println("alive status : " + player.alive);
            System.out.println("powerOn status : " + powerUp.powerOn);


        }
    }

}
