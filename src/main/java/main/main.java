package main;
import Model.Obstacle;
import Utilities.Constants;
import view.MenuView;


public class main {

    public static void main(String args[]){
        Obstacle obstacle = new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, Constants.OBSTACLE_START_X);


        System.out.println("Hello, do you wanna jump and stuff?");
        MenuView menuView = new MenuView(obstacle);
        //new LostRoundView();


    }


}