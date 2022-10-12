package view;

import Utilities.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class LostRoundItemsView extends JComponent {

    private LostRoundItems lrim;

    public LostRoundItemsView(){

        lrim = new LostRoundItems();

        /*this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                int mousex = e.getX();
                int mousey = e.getY();

                if ( mousex >= Constants.MENU_BTN_POSX && mousex <= Constants.MENU_BTN_POSX + Constants.MENU_BTN_WIDTH){

                    if (mousey >= Constants.MENU_BTN_POSY && mousey <= Constants.MENU_BTN_POSY + Constants.MENU_BTN_HEIGHT){

                        //switch to Startpage frame
                        //new MenuView();

                    }
                }

                if ( mousex >= Constants.PLAY_AGAIN_BTN_POSX && mousex <= Constants.PLAY_AGAIN_BTN_POSX + Constants.PLAY_AGAIN_BTN_WIDTH){

                    if (mousey >= Constants.PLAY_AGAIN_BTN_POSY && mousey <= Constants.PLAY_AGAIN_BTN_POSY + Constants.PLAY_AGAIN_BTN_HEIGHT){

                        //switch to Startpage frame
                        //new GameView();

                    }
                }
            }
        });*/

    }

    @Override
    protected void paintComponent(Graphics g) {

        for (IMenuItems i: lrim.getArrayList()){

            i.draw(g);
        }

        this.addMouseListener(new MouseAdapter() {

            @Override
            public void mouseClicked(MouseEvent e) {

                int mousex = e.getX();
                int mousey = e.getY();

                if ( mousex >= Constants.MENU_BTN_POSX && mousex <= Constants.MENU_BTN_POSX + Constants.MENU_BTN_WIDTH){

                    if (mousey >= Constants.MENU_BTN_POSY && mousey <= Constants.MENU_BTN_POSY + Constants.MENU_BTN_HEIGHT){

                        //switch to Startpage frame
                        //new MenuView();

                    }
                }

                if ( mousex >= Constants.PLAY_AGAIN_BTN_POSX && mousex <= Constants.PLAY_AGAIN_BTN_POSX + Constants.PLAY_AGAIN_BTN_WIDTH){

                    if (mousey >= Constants.PLAY_AGAIN_BTN_POSY && mousey <= Constants.PLAY_AGAIN_BTN_POSY + Constants.PLAY_AGAIN_BTN_HEIGHT){

                        //switch to Startpage frame
                        //new GameView();

                    }
                }
            }
        });

    }

}
