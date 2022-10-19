package MenuView;

import Utilities.Constants;
import Model.Shapes;

import java.awt.*;

public class DrawButton extends Shapes implements IDrawMenuItems {


    private int buttonTextPosX;
    private int buttonTextPosY;
    private int textSize;
    private String buttonText;

    public DrawButton(int buttonPosX, int buttonPosY, int buttonWidth, int buttonHeight, int buttonTextPosX, int buttonTextPosY, int textSize, String buttonText){
        super(buttonPosX, buttonPosY, buttonWidth, buttonHeight);
        this.buttonTextPosX = buttonTextPosX;
        this.buttonTextPosY = buttonTextPosY;
        this.textSize = textSize;
        this.buttonText = buttonText;
    }

    private void drawButtonText(Graphics g){

        Font fontbtn = new Font("Bahnschrift", Font.BOLD, textSize);
        g.setFont(fontbtn);
        g.setColor(Color.BLACK); //sets text to black color.
        g.drawString(buttonText, buttonTextPosX, buttonTextPosY); //drawing "Menu" in the rectangle.
    }

    @Override
    public void draw(Graphics g) {

        Graphics2D g2d = (Graphics2D) g;

        g2d.setStroke(new BasicStroke(Constants.BORDER_THICKNESS));
        g.setColor(Color.BLACK);
        g.drawRect(getX(), getY(), getWidth(), getHeight());

        drawButtonText(g);

    }


}
