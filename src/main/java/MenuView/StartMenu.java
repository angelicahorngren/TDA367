package MenuView;

import Controller.PlayButtonController;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class StartMenu extends JPanel{

    /**
     * A constructur for StartMenu.
     * @param drawStartMenu Draws menu-items such as menu title and high score.
     */
    public StartMenu(DrawStartMenu drawStartMenu) {
        BorderLayout borderLayout = new BorderLayout();

        this.setLayout( borderLayout );
        this.add(drawStartMenu);
        this.setBackground(Color.WHITE);
        this.setVisible(true);
    }

}