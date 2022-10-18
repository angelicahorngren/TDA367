package MenusView;

import Model.Score;
import Controller.MenuItemsController;

import javax.swing.*;
import java.awt.*;

public class DrawLostRoundItems extends JComponent {

    private LostRoundItemsList lostRoundPageItemsList;

    public DrawLostRoundItems(MenuItemsController menuBtnC, MenuItemsController playAgainBtnC, Score score){

        lostRoundPageItemsList = new LostRoundItemsList(score);

        this.addMouseListener(menuBtnC);
        this.addMouseListener(playAgainBtnC);


    }

    @Override
    protected void paintComponent(Graphics g) {

        for (IDrawMenuItems lostRoundPageItems: lostRoundPageItemsList.getLostRoundPageItemsArrayList()){

            lostRoundPageItems.draw(g);
        }

    }

}
