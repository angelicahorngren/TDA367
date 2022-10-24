package MenuView;

import Model.Score;
import View.IDraw;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawLostRoundMenuItems extends JComponent {

    private ArrayList<IDraw> lostRoundItems = new ArrayList<>();


    public DrawLostRoundMenuItems(Score score){

        //lostRoundItemsList = new LostRoundItemsList(score);
        lostRoundItems.add(new DrawText("Oops, You lost", 50, 230, 100));
        lostRoundItems.add(new DrawText("score this round: ", 20, 300, 150));
        lostRoundItems.add(new DrawScore(score, false,20, 485, 150));


    }

    @Override
    protected void paintComponent(Graphics g) {

        for (IDraw lostRoundPageItems: lostRoundItems){

            lostRoundPageItems.draw(g);
        }

    }

}
