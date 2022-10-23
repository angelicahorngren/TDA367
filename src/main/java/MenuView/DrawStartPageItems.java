package MenuView;

import Controller.MenuItemsController;
import Model.Score;

import javax.swing.*;
import java.awt.*;


public class DrawStartPageItems extends JComponent {

    private StartPageItemsList startPageItemsList;

    public DrawStartPageItems(MenuItemsController startBtn, Score score) {

        startPageItemsList = new StartPageItemsList(score);


        this.addMouseListener(startBtn);


    }


    @Override
    protected void paintComponent(Graphics g){

        for ( IDraw startPageItems: startPageItemsList.getStartPageItemsArrayList()){

           startPageItems.draw(g);

        }


    }


}

