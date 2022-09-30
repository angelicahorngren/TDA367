package view;


import Utilities.Constants;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LostRoundView extends JFrame {

    Color popUpColor = new Color(255,255,255);
    Container c = getContentPane();


    public LostRoundView(){
        this.setSize(Constants.LOST_ROUND_VIEW_WIDTH, Constants.LOST_ROUND_VIEW_HEIGHT);
        this.add( new LostRoundItems());
        this.setResizable(false);
        this.setUndecorated(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        c.setBackground(popUpColor);
    }

}
