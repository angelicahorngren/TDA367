package Model;

public class CollisionDetector {

    private Player player;
    private Obstacle obstacle;
    private LevelOne levelOne;
    private PowerUp powerUp;


    private Boolean collided;



    public CollisionDetector(Player player, Obstacle obstacle,/* LevelOne levelOne*/ PowerUp powerUp){
        //this.levelOne = levelOne;
        this.player = player;
        this.obstacle = obstacle;
        this.powerUp = powerUp;
        this.collided = false;
    }


    public void detectCollision(){
        if(
            (player.getxPosition() + player.getPlayerWidth() >= obstacle.getxPosition()) &&
            (player.getxPosition() <= obstacle.getxPosition() + obstacle.width) &&
            (player.getyPosition() + player.getPlayerWidth() >= obstacle.getyPosition()) &&
            (player.getyPosition() <= obstacle.getyPosition() + obstacle.height)
                    && !powerUp.getPowerUpStatus()
        )
        {
            player.setPlayerNotAlive();
           //System.out.println("Player x : " + player.getxPosition() + " Player y : " + player.getyPosition());
            //System.out.println("Obstacle x : " + obstacle.getxPosition() + " Obstacle y : " + obstacle.getyPosition());
            //System.out.println("alive status : " + player.alive);

            /*if(obstacle.isDestroyable){
                levelOne.remove(obstacle);
            }*/


            //System.out.println("you lose");
        }

    }




    public void detectCollisionPowerUpObject(){
        if(
                (player.getxPosition() + player.getPlayerWidth() >= powerUp.getxPosition()) &&
                        (player.getxPosition() <= powerUp.getxPosition() + powerUp.getWidth()) &&
                        (player.getyPosition() + player.getPlayerHeight() >= powerUp.getyPosition()) &&
                        (player.getyPosition() <= powerUp.getyPosition() + powerUp.getHeight())
        )
        {
            powerUp.setPowerUpOn();
            System.out.println("u got power");
            /*System.out.println("Player x : " + player.getxPosition() + " Player y : " + player.getyPosition());
            System.out.println("powerUp x : " + powerUp.getxPosition() + " powerUp y : " + powerUp.getyPosition());
            System.out.println("alive status : " + player.alive);
            System.out.println("powerOn status : " + powerUp.powerOn);*/
        }
    }


    public void runCollisionDetectorSystem(){
        detectCollision();
        detectCollisionPowerUpObject();
    }

}
