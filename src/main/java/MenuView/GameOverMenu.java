package MenuView;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class GameOverMenu extends JPanel {


    public GameOverMenu(DrawGameOverMenu drawGameOverMenu){
        BorderLayout borderLayout = new BorderLayout();

        this.setBackground(Color.WHITE);
        this.setLayout(borderLayout);
        this.add(drawGameOverMenu);
        this.setVisible(true);


    }

}
