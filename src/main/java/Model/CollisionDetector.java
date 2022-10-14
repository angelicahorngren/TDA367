package Model;

public class CollisionDetector {

    Player player;
    Object object;


    public Boolean collided;



    public CollisionDetector(Player player, Object object){
        this.player = player;
        this.object = object;
        this.collided = false;
    }


    public void detectCollision(){
        //System.out.println("Player x : " + player.getxPosition() + " Player y : " + player.getyPosition());
        //System.out.println("Obstacle x : " + object.getxPosition() + " Obstacle y : " + object.getyPosition());
        if(
            (player.getxPosition() + player.playerWidth >= object.getxPosition()) &&
            (player.getxPosition() <= object.getxPosition() + object.width) &&
            (player.getyPosition() + player.playerHeight >= object.getyPosition()) &&
            (player.getyPosition() <= object.getyPosition() + object.height)
        )
        {
            player.alive = false;
        }
    }

}
