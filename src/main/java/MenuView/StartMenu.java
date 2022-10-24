package MenuView;

import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class StartMenu extends JPanel{

    public StartMenu(DrawStartMenu drawStartMenu) {

        BorderLayout borderLayout = new BorderLayout();

        this.setLayout( borderLayout );
        this.add(drawStartMenu);
        this.setBackground(Color.WHITE);
        this.setPreferredSize( new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));
        this.setVisible(true);

    }

}