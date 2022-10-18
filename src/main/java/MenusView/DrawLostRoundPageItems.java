package MenusView;


import Controller.MenuItemsController;

import javax.swing.*;
import java.awt.*;

public class DrawLostRoundPageItems extends JComponent {

    private LostRoundPageItemsList lostRoundPageItemsList;

    public DrawLostRoundPageItems(MenuItemsController menuBtnC, MenuItemsController playAgainBtnC){

        lostRoundPageItemsList = new LostRoundPageItemsList();

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
