package MenuView;

import View.IDraw;

import java.awt.*;

public class DrawText implements IDraw {

    private String text;
    private int size;
    private int textPosX; //Placement of text
    private int textPosY;

    /**
     * A constructor for DrawText
     * @param text Text displayed
     * @param size Size of text
     * @param textPosX X-position of text
     * @param textPosY Y-position of text
     */
    public DrawText(String text, int size, int textPosX, int textPosY){
        this.text = text;
        this.size = size;
        this.textPosX = textPosX;
        this.textPosY = textPosY;
    }

    /**
     * Draws a text.
     * @param g is a Graphics class object.
     */
    @Override
    public void draw(Graphics g){
        Font titleFont = new Font("Bell MT", Font.BOLD, size);
        g.setFont(titleFont);
        g.setColor(Color.BLACK);
        g.drawString(text, textPosX, textPosY) ;
    }
}
