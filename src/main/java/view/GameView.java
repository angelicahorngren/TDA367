package view;
import main.Constants;
import main.ProgressBar;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;

public class GameView extends JFrame{
    ProgressBar progressBar = new ProgressBar() ;

    public GameView() {
        this.setTitle(Constants.SCREEN_TITLE);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);

        add(progressBar);
        progressBar.fill();
    }
}
