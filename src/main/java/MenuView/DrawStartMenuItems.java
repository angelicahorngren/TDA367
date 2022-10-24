package MenuView;

import Model.Score;
import Utilities.Constants;
import View.IDraw;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class DrawStartMenuItems extends JComponent {

    private ArrayList<IDraw> startPageItems = new ArrayList<>();

    public DrawStartMenuItems(Score score) {


        startPageItems.add(new DrawText("JumpNStuff", 50, (Constants.SCREEN_WIDTH - 300) / 2, (Constants.SCREEN_HEIGHT - 200)/2));
        startPageItems.add(new DrawText("High Score : ", 40, (Constants.SCREEN_WIDTH - 300) / 2, (Constants.SCREEN_HEIGHT - 35) / 2));
        startPageItems.add(new DrawScore(score.getHighScore(), 40, 500, (Constants.SCREEN_HEIGHT - 35) / 2));


    }


    @Override
    protected void paintComponent(Graphics g){

        for ( IDraw startPageItems: startPageItems){

           startPageItems.draw(g);

        }


    }


}

