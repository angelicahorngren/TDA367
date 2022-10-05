package Model;

import Utilities.Constants;

import javax.swing.*;
import java.awt.*;

public class Player extends JComponent {
    private static int yPosition;
    private static int velY;
    private final int playerWidth;
    private final int playerHeight;
    //private final int X_POS = Constants.PLAYER_START_X;         //startposition för kvadraten xled



    int w = 1500;                       //skärmens bredd (osynlig+synlig)


    public Player () {
        playerWidth = Constants.RECT_WIDTH;
        playerHeight = Constants.RECT_HEIGHT;
        yPosition = Constants.Y_POS;


        //int w = Constants.RECT_WIDTH;
        // int objectHeight = Constants.RECT_HEIGHT;
        int objectSpeed = -3;

    }

    public static void gravity(){
        if(yPosition < Constants.Y_POS){
            yPosition += velY;
            velY += 1;
        }
        else{
            yPosition = Constants.Y_POS;
            velY = 0;
        }
    }

    public void drawPlayer(Graphics g) {

        Graphics2D gg = (Graphics2D) g;


        gg.setColor(Color.MAGENTA);
        gg.fillRect(Constants.PLAYER_START_X - 200,getYPosition(), playerWidth, playerHeight);      //här sätts även yposition

    }

    public int getYPosition(){
        return yPosition;
    }


    public static void jump(){
        yPosition -= 12;
    }

}
