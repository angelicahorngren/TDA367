package view;

import Controller.MenuButtonController;
import Controller.PlayAgainButtonController;
import Controller.StartButtonController;
import Utilities.Constants;

import javax.swing.*;


public class MainWindow extends JFrame {
    MenuView menuView;
    LostRoundView lostRoundView;
    GameView gameView;
    StartButtonController startBtnC;
    PlayAgainButtonController playBtnC;
    MenuButtonController menuBtnC;


    public MainWindow(MenuView menuView, GameView gameView, LostRoundView lostRoundView, StartButtonController startBtnC, PlayAgainButtonController playBtnC, MenuButtonController menuBtnC){
        this.startBtnC = startBtnC;
        this.playBtnC = playBtnC;
        this.menuBtnC = menuBtnC;
        this.menuView = menuView;
        this.gameView = gameView;
        this.lostRoundView = lostRoundView;


        this.setTitle(Constants.SCREEN_TITLE);
        this.setSize(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }



    public void addMenuView(){
        this.add(menuView);
    }

    public void addGameView(){

        this.add(gameView);
    }

    public void addLostRoundView(){
        this.add(lostRoundView);
    }

    public void PanelToFront(){
        if (startBtnC.buttonPressed() || playBtnC.buttonPressed()) {
        this.addGameView();
    } else if (menuBtnC.buttonPressed()) {
        this.addMenuView();
    }

    }

}
