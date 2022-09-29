package view;


import Utilities.Constants;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MenuItems extends JComponent {

    ArrayList<IMenuItems> items = new ArrayList<>();


    public MenuItems(){

        items.add(new Rectangles(Constants.START_BTN_POSX, Constants.START_BTN_POSY, Constants.START_BTN_WIDTH, Constants.START_BTN_HEIGHT));
        items.add(new GameTitle());
        items.add(new HighScoreText());

       this.addMouseListener(new MouseAdapter() {

           @Override
           public void mouseClicked(MouseEvent e) {

               int mousex = e.getX();
               int mousey = e.getY();

               if ( mousex >= Constants.START_BTN_POSX && mousex <= Constants.START_BTN_POSX + 150){

                   if (mousey >= Constants.START_BTN_POSY && mousey <= Constants.START_BTN_POSY + 50){

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
