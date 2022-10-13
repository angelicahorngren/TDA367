package view;
import Controller.MouseListener;
import Model.Collision;
import Model.Player;
import Model.Obstacle;
import Utilities.Constants;
import javax.swing.JFrame;

public class GameView extends JFrame{

    MouseListener mouseListener;
    ProgressBar progressBar = new ProgressBar();


    public GameView(Player player, Obstacle obstacle, Collision collision) {
        add(progressBar);
        mouseListener = new MouseListener();
        addMouseListener(mouseListener);


        this.setTitle(Constants.SCREEN_TITLE);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.add(new PaintingStuff(player, obstacle));

    }


}

