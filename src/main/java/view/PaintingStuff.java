package view;
import javax.swing.*;
import java.awt.*;
import Utilities.Constants;

public class PaintingStuff extends JComponent {
    DrawRectView drawrect = new DrawRectView(Constants.RECT_HEIGHT, Constants.RECT_WIDTH);
    DrawGameBackgroundView dbg = new DrawGameBackgroundView(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
    DrawCircView drawcirc = new DrawCircView(Constants.RECT_HEIGHT,Constants.RECT_WIDTH);
    PlayerView playerView = new PlayerView();


    public void paint(Graphics g){

        drawrect.draw(g);
        dbg.draw2(g);
        drawcirc.draw3(g);
        playerView.drawPlayer(g);


    }
}
