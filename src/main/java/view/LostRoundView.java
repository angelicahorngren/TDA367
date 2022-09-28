package view;


import Utilities.Constants;

import javax.swing.*;
import java.awt.*;

public class LostRoundView extends JFrame {

    Color popUpColor = new Color(30,63,90);
    Container c = getContentPane();

    public LostRoundView(){
        this.setSize(Constants.SCREEN_WIDTH / 2, Constants.SCREEN_HEIGHT / 2);
        this.setResizable(false);
        this.setUndecorated(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        c.setBackground(popUpColor);
    }

}
