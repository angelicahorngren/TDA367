package MenuView;

import Model.Score;
//import Controller.MenuItemsController;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawGameOverMenu extends JComponent {

   // private LostRoundItemsList lostRoundItemsList;
    private ArrayList<IDraw> lostRoundItems = new ArrayList<>();


    public DrawGameOverMenu(Score score){

        //lostRoundItemsList = new LostRoundItemsList(score);
        lostRoundItems.add(new DrawText("Oops, You lost", 50, 230, 100));
        lostRoundItems.add(new DrawText("score this round: ", 20, 300, 150));
        lostRoundItems.add(new DrawScore(score.getCurrentScore(), 20, 485, 150));


    }

    @Override
    protected void paintComponent(Graphics g) {

        for (IDraw lostRoundPageItems: lostRoundItems){

            lostRoundPageItems.draw(g);
        }

    }

}
