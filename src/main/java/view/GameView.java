
//This below works with MainWindow as it is a Jpanel!

package view;
import Controller.MouseListener;
import Model.LevelOne;
import Model.Obstacle;
import Model.Player;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class GameView extends JPanel{



    public GameView(Player player, Obstacle obstacle, ProgressBar progressBar, MouseListener mouseListener, LevelOne levelOne) {

        this.addMouseListener(mouseListener);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setVisible(true);
        this.add(new PaintingStuff(player, obstacle, levelOne));
        BorderLayout borderLayout = new BorderLayout();
        this.setLayout( borderLayout );
        this.setBackground(Color.WHITE);
        this.setPreferredSize( new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));
        this.add(progressBar);
        this.addMouseListener(mouseListener);
        this.add(new PaintingStuff(player, obstacle , levelOne));
        this.setVisible(true);
    }

}

