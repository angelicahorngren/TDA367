package Model;

import Controller.MenuItemsController;
import view.LostRoundView;
import view.MenuView;

public class CollisionDetector {

    Player player;
    Obstacle obstacle;



    public CollisionDetector(Player player, Obstacle obstacle){
        this.player = player;
        this.obstacle = obstacle;
    }


    public void detectCollision(){
        if(
            (player.getxPosition() + player.playerWidth >= obstacle.getxPosition()) &&
            (player.getxPosition() <= obstacle.getxPosition() + obstacle.width) &&
            (player.getyPosition() + player.playerHeight >= obstacle.getyPosition()) &&
            (player.getyPosition() <= obstacle.getyPosition() + obstacle.height)
        )
        {
            System.out.println("Player x : " + player.getxPosition() + " Player y : " + player.getyPosition());
            System.out.println("Obstacle x : " + obstacle.getxPosition() + " Obstacle y : " + obstacle.getyPosition());
        }
    }

}
