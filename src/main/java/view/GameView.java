package view;
import Controller.PlayerKeyController;
import Controller.PlayerMouseController;
import Model.*;
import Utilities.Constants;
import javax.swing.JFrame;
import java.util.ArrayList;

public class GameView extends JFrame{

    public GameView(Player player, ArrayList<Projectile> projectiles, Obstacle obstacle, ProgressBar progressBar, PlayerMouseController mouseListener, PlayerKeyController playerKeyController, LevelOne levelOne) {
        add(progressBar);
        this.addMouseListener(mouseListener);
        this.addKeyListener(playerKeyController);
        this.setTitle(Constants.SCREEN_TITLE);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new PaintingStuff(player, projectiles, obstacle, levelOne));
    }

    //put PaintingStuff stuff here


}

