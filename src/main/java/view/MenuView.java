package view;

import Utilities.Constants;

import javax.swing.*;
import java.awt.*;

public class MenuView extends JComponent {

    private final Rectangle startButton = new Rectangle((Constants.SCREEN_WIDTH - 150) / 2, (Constants.SCREEN_HEIGHT - 170 ), Constants.START_BTN_WIDTH, Constants.START_BTN_HEIGHT); //creating rectangle for button, its placement and size.
    private final int border_thickness = 2; //declares thickness of rectangle border.


    @Override  //not necessary, but can reduce runtime errors and makes code more readable.
    protected void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

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

        //startbutton
        g2d.setStroke(new BasicStroke(border_thickness)); //sets rectangle border to thickness 2, declared earlier.
        //g2d.setPaint(p); //sets color to pink.
        //g2d.fill(startButton); //fills the rectangle with pink color.
        g2d.draw(startButton); //draws the rectangle declared.

        Font fontbtn = new Font("Bahnschrift", Font.BOLD, 30); //creating font for startbutton.
        g.setFont(fontbtn);
        g.setColor(Color.BLACK); //sets text to black color.
        g.drawString("Start", startButton.x + 41, startButton.y + 35); //drawing "Start" in the rectangle.
    }


}

