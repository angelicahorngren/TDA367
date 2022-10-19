package MenusView;

import Controller.MenuItemsController;

import javax.swing.*;
import java.awt.*;


public class DrawStartPageItems extends JComponent {

    private StartPageItemsList startPageItemsList = new StartPageItemsList();

    public DrawStartPageItems(MenuItemsController startBtn) {

        this.addMouseListener(startBtn);


    }


    @Override
    protected void paintComponent(Graphics g){

        for ( IDrawMenuItems startPageItems: startPageItemsList.getStartPageItemsArrayList()){

           startPageItems.draw(g);

        }


    }


}

