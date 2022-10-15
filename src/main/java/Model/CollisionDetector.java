package Model;

public class CollisionDetector {

    Player player;
    Obstacle obstacle;


    public Boolean collided;



    public CollisionDetector(Player player, Obstacle obstacle){
        this.player = player;
        this.obstacle = obstacle;
        this.collided = false;
    }


    public void detectCollision(){
        //System.out.println("Player x : " + player.getxPosition() + " Player y : " + player.getyPosition());
        //System.out.println("Obstacle x : " + object.getxPosition() + " Obstacle y : " + object.getyPosition());
        if(
            (player.getxPosition() + player.playerWidth >= obstacle.getxPosition()) &&
            (player.getxPosition() <= obstacle.getxPosition() + obstacle.width) &&
            (player.getyPosition() + player.playerHeight >= obstacle.getyPosition()) &&
            (player.getyPosition() <= obstacle.getyPosition() + obstacle.height)
        )
        {
            player.alive = false;
        }
    }

}
