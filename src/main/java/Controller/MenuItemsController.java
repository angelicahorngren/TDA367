package Controller;
import Model.Obstacle;
import Utilities.Constants;
import view.GameView;
import view.MenuItemsView;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MenuItemsController extends JComponent {

    //private MenuItemsView miv;

    public MenuItemsController() {

        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                int mousex = e.getX();
                int mousey = e.getY();

                if (mousex >= Constants.START_BTN_POSX && mousex <= Constants.START_BTN_POSX + Constants.START_BTN_WIDTH) {

                    if (mousey >= Constants.START_BTN_POSY && mousey <= Constants.START_BTN_POSY + Constants.START_BTN_HEIGHT) {

                        //switch to gameview frame
                        //new GameView();
                    }
                }
            }

        });

    }

    /*public MouseListener getMouseListener() {

        return new MouseAdapter() {

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

        };
    }*/

}
