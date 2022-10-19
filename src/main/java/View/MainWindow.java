package View;

import Controller.MenuButtonController;
import Controller.PlayAgainButtonController;
import Controller.StartButtonController;
import MenusView.LostRoundMenu;
import MenusView.StartPageMenu;
import Utilities.Constants;

import javax.swing.*;
import java.awt.*;


public class MainWindow extends JFrame {
    private StartPageMenu startPageMenu;
    private LostRoundMenu lostRoundMenu;
    private GameView gameView;
    private StartButtonController startBtnC;
    private PlayAgainButtonController playBtnC;
    private MenuButtonController menuBtnC;
    public CardLayout card = new CardLayout();


    public MainWindow(StartPageMenu startPageMenu, GameView gameView, LostRoundMenu lostRoundMenu, StartButtonController startBtnC, PlayAgainButtonController playBtnC, MenuButtonController menuBtnC) {
        this.startBtnC = startBtnC;
        this.playBtnC = playBtnC;
        this.menuBtnC = menuBtnC;
        this.startPageMenu = startPageMenu;
        this.gameView = gameView;
        this.lostRoundMenu = lostRoundMenu;
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
        if (startBtnC.getXvalueStartBtn() == 2 || playBtnC.getXvaluePlayBtn() == 2) {
            //this.removeAll();
            this.setContentPane(gameView);
        } else if (menuBtnC.getXvalueMenuBtn() == 2) {
            this.setContentPane(startPageMenu);
        }
    }
            //this.update(getGraphics());
            //this.repaint();
            //startBtnC.buttonPressed();*/


        //if ((startBtnC.buttonPressed() && playBtnC.buttonPressed() && menuBtnC.buttonPressed()) == false) {
            //this.setContentPane(startPageMenu);

         /*if (startBtnC.buttonPressed() || playBtnC.buttonPressed()) {
            //this.setContentPane(gameView); //toFront

        } else if (menuBtnC.buttonPressed()) {
           // this.setContentPane(startPageMenu); //toFront*/
}



