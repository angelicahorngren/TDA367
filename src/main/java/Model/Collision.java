package Model;

import Controller.MenuItemsController;
import view.LostRoundView;
import view.MenuView;

public class Collision {

    Player player;
    Obstacle obstacle;



    public Collision(Player player, Obstacle obstacle){
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
            System.out.println("touching detected warning warning you died you are shit at the game");
        }
    }

}
