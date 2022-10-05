package Model;

import Controller.KL;
import Utilities.Constants;


public class PlayerModel {
    public static int yPosition;
    public static int velY;
    public final int playerWidth;
    public final int playerHeight;


    public PlayerModel() {
        playerWidth = Constants.RECT_WIDTH;
        playerHeight = Constants.RECT_HEIGHT;
        yPosition = Constants.Y_POS;

    }

    public static void gravity() {
        if (yPosition < Constants.Y_POS) {
            yPosition += velY;
            velY += 1;
        } else {
            yPosition = Constants.Y_POS;
            velY = 0;
        }

    }

    public static void jump() {
        yPosition -= 12;
    }


    public int getYPosition() {
        return yPosition;
    }


}

