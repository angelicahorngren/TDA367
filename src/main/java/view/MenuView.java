package view;
import Model.Obstacle;
import Utilities.Constants;
import javax.swing.*;

public class MenuView extends JFrame{

    public MenuView(Obstacle obstacle) {


        this.setTitle("JumpNStuff");
        this.setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        this.add( new MenuItemsView(obstacle));
        this.setResizable(false);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

}