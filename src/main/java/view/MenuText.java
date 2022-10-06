package view;

import Utilities.Constants;

import java.awt.*;

public class MenuText implements Texts {

    private String t;
    private int s;
    private int xc; //Placement of text
    private int yc;

    public MenuText(String text, int size, int Xcentering, int Ycentering){
        t = text;
        s = size;
        xc = Xcentering;
        yc = Ycentering;
    }
    @Override
    public void draw(Graphics g){
        Font titleFont = new Font("Bell MT", Font.BOLD, s);
        g.setFont(titleFont);
        g.setColor(Color.BLACK);
        g.drawString(t, xc, yc) ;
    }
}
