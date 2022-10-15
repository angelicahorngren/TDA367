package view;
import Controller.PlayerKeyController;
import Controller.PlayerMouseController;
import Model.LevelOne;
import Model.Obstacle;
import Model.Player;
import Utilities.Constants;
import javax.swing.JFrame;

public class GameView extends JFrame{

    public GameView(Player player, Obstacle obstacle, ProgressBar progressBar, PlayerMouseController mouseListener, PlayerKeyController playerKeyController, LevelOne levelOne) {
        add(progressBar);
        this.addMouseListener(mouseListener);
        this.addKeyListener(playerKeyController);
        this.setTitle(Constants.SCREEN_TITLE);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new PaintingStuff(player, obstacle, levelOne));
    }

    //put PaintingStuff stuff here


}

