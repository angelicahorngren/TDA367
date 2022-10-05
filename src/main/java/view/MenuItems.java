package view;

import Utilities.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MenuItems extends JComponent {

    ArrayList<IMenuItems> items = new ArrayList<>();

    public MenuItems(){     //Göra om MenuButtons till JButton
        items.add(new MenuButton(Constants.START_BTN_POSX, Constants.START_BTN_POSY, Constants.START_BTN_WIDTH, Constants.START_BTN_HEIGHT, Constants.START_BTN_POSX + 41, Constants.START_BTN_POSY + 35, 30, "Start"));
        items.add(new MenuText("JumpNStuff", 50, (Constants.SCREEN_WIDTH - 260)/2, (Constants.SCREEN_HEIGHT - 200)/2));
        items.add(new MenuText("High Score : ", 40, (Constants.SCREEN_WIDTH - 300) / 2, (Constants.SCREEN_HEIGHT - 35) / 2));

       this.addMouseListener(new MouseAdapter() {

           @Override
           public void mouseClicked(MouseEvent e) {

               int mousex = e.getX();
               int mousey = e.getY();

               if ( mousex >= Constants.START_BTN_POSX && mousex <= Constants.START_BTN_POSX + Constants.START_BTN_WIDTH){

                   if (mousey >= Constants.START_BTN_POSY && mousey <= Constants.START_BTN_POSY + Constants.START_BTN_HEIGHT){

                       //switch to gameview frame
                       new GameView();

                   }
               }
           }
       });

    }

    @Override  //not necessary, but can reduce runtime errors and makes code more readable.
    protected void paintComponent(Graphics g){

        for (IMenuItems i: items){
            i.draw(g);
        }

    }

}
