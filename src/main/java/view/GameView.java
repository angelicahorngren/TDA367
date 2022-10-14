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


    public GameView(Player player, Obstacle obstacle, ProgressBar progressBar, MouseListener mouseListener, LostRoundView lostRoundView) {
        add(progressBar);
        this.addMouseListener(mouseListener);

        FlowLayout flowLayout = new FlowLayout();
        this.setTitle(Constants.SCREEN_TITLE);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(flowLayout);

        JPanel mainPanel = new JPanel(flowLayout);
        mainPanel.add(lostRoundView);
        add(mainPanel);

        this.addMouseListener(mouseListener);
        //this.add(lostRoundView);


        this.setLocationRelativeTo(null);
        this.add(new PaintingStuff(player, obstacle));

    }


}

