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

    /**
     * This is the constructor for the JFrame, that is the main window.
     * @param startMenu is a JPanel where the application starts.
     * @param gameOverMenu is a JPanel shown when player loses game.
     * @param gameView is a JPanel where the game is displayed.
     * @param gameLoop is the game loop of the game that updates every 10 ms.
     * @param viewContainer is a JPanel that contains startMenu, gameOverMenu and gameView and switches between them.
     */
    public Window(StartMenu startMenu, GameOverMenu gameOverMenu, GameView gameView, GameLoop gameLoop, ViewContainer viewContainer){
        this.startMenu = startMenu;
        this.gameOverMenu = gameOverMenu;
        this.gameView = gameView;
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

        this.startMenu.add(startButton, BorderLayout.SOUTH);
        this.gameOverMenu.add(playAgainButton, BorderLayout.SOUTH);
        this.gameOverMenu.add(goToStartMenuButton, BorderLayout.NORTH);


        frame.add(viewContainer);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);
    }

}



