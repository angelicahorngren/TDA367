package Model;

import Controller.KL;
import Utilities.Constants;


public class PlayerModel {
    public static int yPosition;
    public static int velY;
    public final int playerWidth;
    public final int playerHeight;
    public static int velReducer;


    public PlayerModel() {
        playerWidth = Constants.RECT_WIDTH;
        playerHeight = Constants.RECT_HEIGHT;
        yPosition = Constants.Y_POS;

    }

    public static void gravity() {
        if (yPosition < Constants.Y_POS) {
            velReducer++;
            if (velReducer % 2 == 0){
                velY++;
            }
            yPosition += velY;
        } else {
            yPosition = Constants.Y_POS;
            velY = 0;
            velReducer = 0;
        }

    }

    public static void jump() {
        yPosition -= 10;
    }


    public int getYPosition() {
        return yPosition;
    }


}

