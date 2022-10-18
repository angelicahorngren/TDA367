package MenusView;

import Controller.MenuItemsController;

import javax.swing.*;
import java.awt.*;


public class DrawStartPageItems extends JComponent {

    private StartPageItemsList startPageItemsList;

    public DrawStartPageItems(MenuItemsController startBtn) {

        startPageItemsList = new StartPageItemsList();

        this.addMouseListener(startBtn);


    }


    @Override
    protected void paintComponent(Graphics g){

        for ( IDrawMenuItems startPageItems: startPageItemsList.getStartPageItemsArrayList()){

           startPageItems.draw(g);

        }


    }


}

