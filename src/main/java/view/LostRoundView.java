package view;
import Controller.MenuItemsController;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class LostRoundView extends JPanel {



    public LostRoundView(LostRoundItemsView lostRoundItemsView){
        BorderLayout borderLayout = new BorderLayout();

        this.setBackground(Color.RED);
        this.setBounds(20, 20, Constants.LOST_ROUND_VIEW_WIDTH, Constants.LOST_ROUND_VIEW_HEIGHT);

        //this.setResizable(false);
        //this.setUndecorated(true);

        this.setLayout(borderLayout);
        this.add(lostRoundItemsView);

        //this.setPreferredSize(new Dimension(Constants.LOST_ROUND_VIEW_WIDTH, Constants.LOST_ROUND_VIEW_HEIGHT));
        this.setVisible(true);
        //this.setLocationRelativeTo(null);


    }

}
