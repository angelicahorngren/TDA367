package view;


import Controller.MenuItemsController;
import Utilities.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LostRoundItemsView extends JComponent {

    private LostRoundItems lrim;

    public LostRoundItemsView(MenuItemsController menuBtnC, MenuItemsController playAgainBtnC){

        lrim = new LostRoundItems();

        this.addMouseListener(menuBtnC);
        this.addMouseListener(playAgainBtnC);


    }

    @Override
    protected void paintComponent(Graphics g) {

        for (IMenuItems i: lrim.getArrayList()){

            i.draw(g);
        }

    }

}
