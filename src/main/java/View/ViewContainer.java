package View;

import MenuView.GameOverMenu;
import MenuView.StartMenu;

import javax.swing.*;
import java.awt.*;

public class ViewContainer extends JPanel {

    CardLayout cl = new CardLayout();
    StartMenu startMenu;
    GameOverMenu gameOverMenu;
    GameView gameView;

    /**
     * This is the constructor for our JPanel that is the container for our other JPanels StartMenu, GameView and GameOverMenu.
     * @param startMenu is a JPanel where the application starts.
     * @param gameOverMenu is a JPanel shown when player loses game.
     * @param gameView is a JPanel where the game is displayed.
     */
    public ViewContainer(StartMenu startMenu, GameOverMenu gameOverMenu, GameView gameView){
        this.setLayout(cl);
        this.startMenu = startMenu;
        this.gameOverMenu = gameOverMenu;
        this.gameView = gameView;

        this.add(startMenu, "1");
        this.add(gameOverMenu, "2");
        this.add(gameView, "3");

        cl.show(this,"1"); //Chooses witch screen it starts on
    }

    /**
     * This is our CardLayout-class
     * @return a cardLayout-object
     */
    public CardLayout getCardLayout(){
        return cl;
    }

    /**
     * Changes the visible JPanel to GameView
     */
    public void startGame(){
        cl.show(this, "3");
        gameView.setFocusable(true);
        gameView.requestFocusInWindow();

    }

    /**
     * Changes the visible JPanel to StartMenu
     */
    public void goToStartMenu(){
        cl.show(this, "1");
    }

    /**
     * Changes the visible JPanel to GameOverMenu
     */
    public void gameOver(){
        cl.show(this, "2");
    }

}
