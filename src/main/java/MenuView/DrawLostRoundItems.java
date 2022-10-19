package MenuView;

import Model.Score;
import Controller.MenuItemsController;

import javax.swing.*;
import java.awt.*;

public class DrawLostRoundItems extends JComponent {

    private LostRoundItemsList lostRoundPageItemsList;

    public DrawLostRoundItems(Score score){

        lostRoundPageItemsList = new LostRoundItemsList(score);


    }

    @Override
    protected void paintComponent(Graphics g) {

        for (IDrawMenuItems lostRoundPageItems: lostRoundPageItemsList.getLostRoundPageItemsArrayList()){

            lostRoundPageItems.draw(g);
        }

    }

}
