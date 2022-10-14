package view;
import Controller.MenuItemsController;
import Controller.StartButtonController;
import Model.Obstacle;
import Model.Player;
import Utilities.Constants;

import javax.swing.*;
import java.awt.*;

public class MenuView extends JPanel{

    public MenuView( MenuItemsView menuItemsView) {

        BorderLayout borderLayout = new BorderLayout();

        this.setLayout( borderLayout );

        this.add( menuItemsView );

        this.setBackground(Color.WHITE);
        this.setPreferredSize( new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));

        this.setVisible(true);


    }


}