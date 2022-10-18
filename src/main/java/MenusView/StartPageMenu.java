package MenusView;

import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class StartPageMenu extends JPanel{

    public StartPageMenu(DrawStartPageItems drawStartPageItems) {

        BorderLayout borderLayout = new BorderLayout();

        this.setLayout( borderLayout );
        this.add(drawStartPageItems);
        this.setBackground(Color.WHITE);
        this.setPreferredSize( new Dimension(Constants.SCREEN_WIDTH, Constants.SCREEN_HEIGHT));
        this.setVisible(true);

    }

}