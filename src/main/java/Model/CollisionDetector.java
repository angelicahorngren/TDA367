package Model;

public class CollisionDetector {

    Player player;
    Obstacle obstacle;
    LevelOne levelOne;


    public Boolean collided;



    public CollisionDetector(Player player, Obstacle obstacle, LevelOne levelOne){
        this.levelOne = levelOne;
        this.player = player;
        this.obstacle = obstacle;
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
            if(obstacle.isDestroyable){
                levelOne.remove(obstacle);
            }
            player.alive = false;
        }
    }

}
