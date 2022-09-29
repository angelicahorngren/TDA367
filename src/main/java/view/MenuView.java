package view;


import Utilities.Constants;

import javax.swing.*;

public class MenuView{

    JFrame jframe = new JFrame();

    public MenuView() {

        this.jframe.setTitle("JumpNStuff");
        this.jframe.setSize(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT);
        this.jframe.add( new MenuItems());
        this.jframe.setResizable(false);
        this.jframe.setVisible(true);
        this.jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.jframe.setLocationRelativeTo(null);
    }

}