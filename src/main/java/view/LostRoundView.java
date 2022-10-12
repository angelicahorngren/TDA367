package view;
import Controller.MenuItemsController;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class LostRoundView extends JFrame {

    Color popUpColor = new Color(255,255,255);
    Container c = getContentPane();


    public LostRoundView(MenuItemsController menuBtnC, MenuItemsController playAgainBtnC){
        this.setSize(Constants.LOST_ROUND_VIEW_WIDTH, Constants.LOST_ROUND_VIEW_HEIGHT);
        this.add( new LostRoundItemsView(menuBtnC, playAgainBtnC));
        this.setResizable(false);
        this.setUndecorated(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        c.setBackground(popUpColor);
    }

}
