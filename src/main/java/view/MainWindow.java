package view;

import Controller.MenuButtonController;
import Controller.MenuItemsController;
import Controller.PlayAgainButtonController;
import Controller.StartButtonController;
import Utilities.Constants;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {
    MenuView menuView;
    LostRoundView lostRoundView;
    GameView gameView;
    StartButtonController startBtnC;
    PlayAgainButtonController playBtnC;
    MenuButtonController menuBtnC;
    public CardLayout card = new CardLayout();
    public JPanel container = new JPanel();


    public MainWindow(MenuView menuView, GameView gameView, LostRoundView lostRoundView, StartButtonController startBtnC, PlayAgainButtonController playBtnC, MenuButtonController menuBtnC) {
        this.startBtnC = startBtnC;
        this.playBtnC = playBtnC;
        this.menuBtnC = menuBtnC;
        this.menuView = menuView;
        this.gameView = gameView;
        this.lostRoundView = lostRoundView;
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
}