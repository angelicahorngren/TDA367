package MenuView;

import Model.Score;
import Utilities.Constants;
import View.IDraw;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawLostRoundMenuItems extends JComponent {

    private ArrayList<IDraw> lostRoundItems = new ArrayList<>();


    public DrawLostRoundMenuItems(Score score){

        //lostRoundItemsList = new LostRoundItemsList(score);
        lostRoundItems.add(new DrawText(Constants.GAME_OVER_MENU_TITLE_TEXT, Constants.GAME_OVER_MENU_TITLE_SIZE, Constants.GAME_OVER_MENU_TITLE_POS_X, Constants.GAME_OVER_MENU_TITLE_POS_Y));
        lostRoundItems.add(new DrawText(Constants.GAME_OVER_THIS_ROUND_TEXT, Constants.GAME_OVER_MENU_THIS_ROUND_SIZE, Constants.GAME_OVER_MENU_THIS_ROUND_POS_X, Constants.GAME_OVER_MENU_THIS_ROUND_POS_Y));
        lostRoundItems.add(new DrawScore(score, false,Constants.GAME_OVER_MENU_SCORE_SIZE, Constants.GAME_OVER_MENU_SCORE_POS_X, Constants.GAME_OVER_MENU_SCORE_POS_Y));


    }

    @Override
    protected void paintComponent(Graphics g) {

        for (IDraw lostRoundPageItems: lostRoundItems){

            lostRoundPageItems.draw(g);
        }

    }

}
