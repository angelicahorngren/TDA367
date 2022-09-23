package view;
import main.Constants;
import javax.swing.JFrame;
import java.awt.*;


public class GameView extends JFrame{
    public GameView() {
        DrawGameBackground dbg = new DrawGameBackground(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        /*ProgressBar pb = new ProgressBar(); */
        this.setTitle(Constants.SCREEN_TITLE);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.add(dbg);
        /*this.add(pb);*/
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new Canvas());
    }
}
