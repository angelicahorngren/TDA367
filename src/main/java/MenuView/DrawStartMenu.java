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

        startMenuItems.add(new DrawText(Constants.START_MENU_TITLE_TEXT, Constants.START_MENU_TITLE_SIZE, Constants.START_MENU_TITLE_POS_X, Constants.START_MENU_TITLE_POS_Y));
        startMenuItems.add(new DrawText(Constants.START_HIGH_SCORE_TEXT, Constants.START_MENU_HIGH_SCORE_SIZE, Constants.START_MENU_HIGH_SCORE_POS_X, Constants.START_MENU_HIGH_SCORE_POS_Y));
        startMenuItems.add(new DrawScore(score, true, Constants.START_MENU_SCORE_SIZE, Constants.START_MENU_SCORE_POS_X, Constants.START_MENU_SCORE_POS_Y));

    }


    @Override
    protected void paintComponent(Graphics g){

        for ( IDraw startMenuItems: startMenuItems){

           startMenuItems.draw(g);


        }


    }


}

