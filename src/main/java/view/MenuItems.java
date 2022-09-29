package view;


import Utilities.Constants;


import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class MenuItems extends JComponent {

    ArrayList<Shape> shapes = new ArrayList<>();
    Rectangles rectangle = new Rectangles(Constants.START_BTN_POSX, Constants.START_BTN_POSY, Constants.START_BTN_WIDTH, Constants.START_BTN_HEIGHT);


    public MenuItems(){
       shapes.add(rectangle);


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

        for (Shape s: shapes){
            s.draw(g);
        }

    }


       /* Graphics2D g2d = (Graphics2D) g;

        //Game title
        Font titleFont = new Font("Bell MT", Font.BOLD, 50);
        g.setFont(titleFont);
        g.setColor(Color.BLACK);
        g.drawString("JumpNStuff", (Constants.SCREEN_WIDTH - 260) / 2, (Constants.SCREEN_HEIGHT - 200) / 2);

        //HighScore
        Font font = new Font("Agency FB", Font.PLAIN, 40); //creating font for HighScore: text.
        g.setFont(font);
        g.setColor(Color.BLACK); // setting font color
        g.drawString("High Score : ", (Constants.SCREEN_WIDTH - 300) / 2, (Constants.SCREEN_HEIGHT - 35) / 2); //drawing the "HighScore:" text.

*/
}
