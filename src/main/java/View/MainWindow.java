package View;

import Controller.MenuButtonController;
import Controller.PlayAgainButtonController;
import Controller.StartButtonController;
import MenusView.LostRoundPageView;
import MenusView.StartPageView;
import Utilities.Constants;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {
    private StartPageView startPageView;
    private LostRoundPageView lostRoundPageView;
    private GameView gameView;
    private StartButtonController startBtnC;
    private PlayAgainButtonController playBtnC;
    private MenuButtonController menuBtnC;
    public CardLayout card = new CardLayout();
    public JPanel container = new JPanel();


    public MainWindow(StartPageView startPageView, GameView gameView, LostRoundPageView lostRoundPageView, StartButtonController startBtnC, PlayAgainButtonController playBtnC, MenuButtonController menuBtnC) {
        this.startBtnC = startBtnC;
        this.playBtnC = playBtnC;
        this.menuBtnC = menuBtnC;
        this.startPageView = startPageView;
        this.gameView = gameView;
        this.lostRoundPageView = lostRoundPageView;
        //container.setLayout(card);
        //this.add(menuView)
        //container.add(menuView);
        //container.add(gameView);
        //container.add(lostRoundView);
        //this.add(container);


        this.setTitle(Constants.SCREEN_TITLE);
        this.setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }

    public void setPanel() {
        if (startBtnC.getXvalueStartBtn() == 2) {
            this.removeAll();
            this.setContentPane(gameView);
            this.update(getGraphics());
            this.repaint();
            //startBtnC.buttonPressed();
        }
    }

    /*public MenuView getMenuView(){
        return this.menuView;
    }

    public GameView getGameView(){

        return this.gameView;
    }

    public LostRoundView getLostRoundView(){
        return this.lostRoundView;
    }*/

}
