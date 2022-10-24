package MenuView;

import Model.Score;
import Utilities.Constants;
import View.IDraw;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class DrawStartMenu extends JComponent {

    private ArrayList<IDraw> startMenuItems = new ArrayList<>();

    public DrawStartMenu(Score score) {

        startMenuItems.add(new DrawText("JumpNStuff", 50, (Constants.SCREEN_WIDTH - 300) / 2, (Constants.SCREEN_HEIGHT - 200)/2));
        startMenuItems.add(new DrawText("High Score : ", 40, (Constants.SCREEN_WIDTH - 300) / 2, (Constants.SCREEN_HEIGHT - 35) / 2));
        startMenuItems.add(new DrawScore(score, true, 40, 500, (Constants.SCREEN_HEIGHT - 35) / 2));


    }


    @Override
    protected void paintComponent(Graphics g){

        for ( IDraw startMenuItems: startMenuItems){

           startMenuItems.draw(g);


        }


    }


}

