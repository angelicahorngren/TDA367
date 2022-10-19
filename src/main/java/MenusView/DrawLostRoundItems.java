package MenusView;

import Model.Score;
import Controller.MenuItemsController;

import javax.swing.*;
import java.awt.*;

public class DrawLostRoundItems extends JComponent {

    private LostRoundItemsList lostRoundItemsList;

    public DrawLostRoundItems(MenuItemsController menuBtnC, MenuItemsController playAgainBtnC, Score score){

        lostRoundItemsList = new LostRoundItemsList(score);

        this.addMouseListener(menuBtnC);
        this.addMouseListener(playAgainBtnC);


    }

    @Override
    protected void paintComponent(Graphics g) {

        for (IDrawMenuItems lostRoundPageItems: lostRoundItemsList.getLostRoundPageItemsArrayList()){

            lostRoundPageItems.draw(g);
        }

    }

}