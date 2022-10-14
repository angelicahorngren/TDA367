package view;

import Controller.MenuItemsController;
import Model.Obstacle;
import Model.Player;

import javax.swing.*;
import java.awt.*;


public class MenuItemsView extends JComponent {

    private MenuItems mi;

    public MenuItemsView(MenuItemsController startBtn) {

        mi = new MenuItems();

        this.addMouseListener(startBtn);


    }



    @Override
    protected void paintComponent(Graphics g){

        for ( IMenuItems i: mi.getArrayList()){

            i.draw(g);

        }


    }


}

