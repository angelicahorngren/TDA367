package View;

import MenuView.LostRoundMenu;
import MenuView.StartMenu;

import javax.swing.*;
import java.awt.*;

public class ViewContainer extends JPanel {
    CardLayout cl = new CardLayout();
    StartMenu startPageMenu;
    LostRoundMenu lostRoundMenu;
    GameView gameView;

    public ViewContainer(StartMenu startPageMenu, LostRoundMenu lostRoundMenu, GameView gameView){
        this.setLayout(cl);
        this.startPageMenu = startPageMenu;
        this.lostRoundMenu = lostRoundMenu;
        this.gameView = gameView;

        this.add(startPageMenu, "1");
        this.add(lostRoundMenu, "2");
        this.add(gameView, "3");
        cl.show(this,"1"); //Chooses witch screen it starts on
    }

    public CardLayout getCardLayout(){
        return cl;
    }

    public void startGame(){
        cl.show(this, "3");
        gameView.setFocusable(true);
        gameView.requestFocusInWindow();
     //   Constants.Thread_argument_ms = 10;

    }

    public void goToStartPage(){
        cl.show(this, "1");
    }

    public void gameOver(){
        cl.show(this, "2");
    }

}
