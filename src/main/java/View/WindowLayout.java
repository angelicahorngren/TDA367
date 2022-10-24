package View;

import Controller.StartButtonController;
import MenuView.LostRoundMenu;
import MenuView.StartMenu;
import main.GameLoop;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class WindowLayout extends JFrame {

    JFrame frame = new JFrame("Jump and Stuff");
    private ViewContainer viewContainer;
    private StartMenu startPageMenu;
    private LostRoundMenu lostRoundMenu;
    private GameView gameView;
    StartButtonController startButtonPressed;

    JButton startButton = new JButton("Start");
    JButton playAgainButton = new JButton("Play again");
    JButton goToStartPageButton = new JButton("Go to Start page");

    public WindowLayout(StartMenu SPM, LostRoundMenu LRM, GameView gv, StartButtonController startBtnC, GameLoop gameLoop, ViewContainer viewContainer){
        this.startPageMenu = SPM;
        this.lostRoundMenu = LRM;
        this.gameView = gv;
        this.startButtonPressed = startBtnC;
        this.viewContainer = viewContainer;
        this.setResizable(false);


        startButton.setPreferredSize(new Dimension(0, 80));
        startButton.setFont(new Font("Comic Sans", Font.BOLD, 40));
        playAgainButton.setPreferredSize(new Dimension(0, 40));
        playAgainButton.setFont(new Font("Comic Sans", Font.BOLD, 20));
        goToStartPageButton.setPreferredSize(new Dimension(0, 40));
        goToStartPageButton.setFont(new Font("Comic Sans", Font.BOLD, 20));

        startPageMenu.add(startButton, BorderLayout.SOUTH);
        lostRoundMenu.add(playAgainButton, BorderLayout.SOUTH);
        lostRoundMenu.add(goToStartPageButton, BorderLayout.NORTH);


        startButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Thread thread = new Thread(gameLoop);
                viewContainer.startGame();
                thread.start();
            }
        });

        playAgainButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewContainer.startGame();
                Thread thread = new Thread(gameLoop);
                thread.start();
            }
        });

        goToStartPageButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                viewContainer.goToStartPage();
            }
        });

        frame.add(viewContainer);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

}



