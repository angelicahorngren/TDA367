package view;
import Controller.MouseListener;
import Model.CollisionDetector;
import Model.Player;
import Model.Obstacle;
import Utilities.Constants;

import javax.swing.*;
import java.awt.*;

public class GameView extends JFrame{

    //MouseListener mouseListener;
    //ProgressBar progressBar = new ProgressBar();


    public GameView(Player player, Obstacle obstacle, ProgressBar progressBar, MouseListener mouseListener, MenuView menuView) {

        FlowLayout mainLayout = new FlowLayout();
        this.setTitle(Constants.SCREEN_TITLE);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout( mainLayout );

        JPanel mainPanel = new JPanel( mainLayout );

        mainPanel.add(menuView);
        add(mainPanel);

        add(progressBar);
        this.addMouseListener(mouseListener);

        this.setLocationRelativeTo(null);
        this.add(new PaintingStuff(player, obstacle));
        this.setVisible(true);

    }


}

