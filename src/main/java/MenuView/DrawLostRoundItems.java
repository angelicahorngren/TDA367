package MenuView;

import Model.Score;
import Controller.MenuItemsController;

import javax.swing.*;
import java.awt.*;

public class DrawLostRoundItems extends JComponent {

    private LostRoundItemsList lostRoundItemsList;

    public DrawLostRoundItems(Score score){

        lostRoundItemsList = new LostRoundItemsList(score);


    }

    @Override
    protected void paintComponent(Graphics g) {

        for (IDrawMenuItems lostRoundPageItems: lostRoundItemsList.getLostRoundPageItemsArrayList()){

            lostRoundPageItems.draw(g);
        }

    }

}
