package view;
import Controller.MenuItemsController;
import Model.Obstacle;
import Model.Player;
import Utilities.Constants;
import javax.swing.*;

public class MenuView extends JFrame{

    public MenuView(MenuItemsController startBtnC) {

        this.setTitle("JumpNStuff");
        this.setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        this.add( new MenuItemsView(startBtnC));
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

}