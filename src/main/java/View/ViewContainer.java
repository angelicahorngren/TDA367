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

    public void startGame(){
        cl.show(this, "3");
        gameView.setFocusable(true);
        gameView.requestFocusInWindow();

    }


    public void goToStartPage(){
        cl.show(this, "1");
    }

    public void gameOver(){
        cl.show(this, "2");
    }

}
