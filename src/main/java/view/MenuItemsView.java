package view;

import Model.MenuItemsModel;
import Utilities.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuItemsView extends JComponent {

    public MenuItemsModel mi;

    public MenuItemsView(){

        mi = new MenuItemsModel();

        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                int mousex = e.getX();
                int mousey = e.getY();

                if (mousex >= Constants.START_BTN_POSX && mousex <= Constants.START_BTN_POSX + Constants.START_BTN_WIDTH) {

                    if (mousey >= Constants.START_BTN_POSY && mousey <= Constants.START_BTN_POSY + Constants.START_BTN_HEIGHT) {

                        //switch to gameview frame
                        new GameView();
                    }
                }
            }

        });

    }

    @Override
    protected void paintComponent(Graphics g){

        for ( IMenuItems i: mi.getArrayList()){

            i.draw(g);

        }

    }


}
