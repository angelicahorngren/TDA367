package view;
import Controller.MenuItemsController;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class LostRoundView extends JPanel {

    Color popUpColor = new Color(255,255,255);
    //Container c = getContentPane();


    public LostRoundView(LostRoundItemsView lostRoundItemsView){
        BorderLayout borderLayout = new BorderLayout();

        //this.setResizable(false);
        //this.setUndecorated(true);
        this.setLayout(borderLayout);
        this.add(lostRoundItemsView);
        repaint();
        this.setBackground(Color.white);
        this.setPreferredSize(new Dimension(Constants.LOST_ROUND_VIEW_WIDTH, Constants.LOST_ROUND_VIEW_HEIGHT));
        this.setVisible(true);
        //this.setLocationRelativeTo(null);
        //c.setBackground(popUpColor);

    }

}
