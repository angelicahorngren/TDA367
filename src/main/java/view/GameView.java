package view;
import Controller.PlayerController;
import Model.LevelOne;
import Model.Player;
import Model.Object;
import Utilities.Constants;
import javax.swing.JFrame;
import java.awt.*;

public class GameView extends JFrame{

    //MouseListener mouseListener;
    //ProgressBar progressBar = new ProgressBar();


    public GameView(Player player, Object object, ProgressBar progressBar, PlayerController mouseListener, LevelOne levelOne) {
        add(progressBar);
        this.addMouseListener(mouseListener);
        this.setTitle(Constants.SCREEN_TITLE);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new PaintingStuff(player, object, levelOne));
    }

    //put PaintingStuff stuff here


}

