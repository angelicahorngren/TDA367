package MenuView;

import Controller.PlayButtonController;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class StartMenu extends JPanel{

    public StartMenu(DrawStartMenu drawStartMenu) {

        BorderLayout borderLayout = new BorderLayout();


        this.setLayout( borderLayout );
        this.add(drawStartMenu);
        this.setBackground(Color.WHITE);
        this.setVisible(true);

    }

}