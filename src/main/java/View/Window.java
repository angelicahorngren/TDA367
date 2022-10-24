package View;

import Controller.MenuButtonController;
import Controller.PlayButtonController;
import MenuView.GameOverMenu;
import MenuView.StartMenu;
import main.GameLoop;

import javax.swing.*;
import java.awt.*;


public class Window extends JFrame {

    JFrame frame = new JFrame("Jump and Stuff");
    private ViewContainer viewContainer;
    private StartMenu startMenu;
    private GameOverMenu gameOverMenu;
    private GameView gameView;

    JButton startButton = new JButton("Start");
    JButton playAgainButton = new JButton("Play again");
    JButton goToStartMenuButton = new JButton("Go to Start page");

    public Window(StartMenu SPM, GameOverMenu GOM, GameView GV ,GameLoop gameLoop, ViewContainer viewContainer){
        this.startMenu = SPM;
        this.gameOverMenu = GOM;
        this.gameView = GV;
        this.viewContainer = viewContainer;


        PlayButtonController playButtonController = new PlayButtonController(gameLoop, viewContainer);
        startButton.addActionListener(playButtonController);
        playAgainButton.addActionListener(playButtonController);

        MenuButtonController menuButtonController = new MenuButtonController(viewContainer);
        goToStartMenuButton.addActionListener(menuButtonController);


        startButton.setPreferredSize(new Dimension(0, 80));
        startButton.setFont(new Font("Comic Sans", Font.BOLD, 40));

        playAgainButton.setPreferredSize(new Dimension(0, 40));
        playAgainButton.setFont(new Font("Comic Sans", Font.BOLD, 20));

        goToStartMenuButton.setPreferredSize(new Dimension(0, 40));
        goToStartMenuButton.setFont(new Font("Comic Sans", Font.BOLD, 20));

        startMenu.add(startButton, BorderLayout.SOUTH);
        gameOverMenu.add(playAgainButton, BorderLayout.SOUTH);
        gameOverMenu.add(goToStartMenuButton, BorderLayout.NORTH);


        frame.add(viewContainer);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}



