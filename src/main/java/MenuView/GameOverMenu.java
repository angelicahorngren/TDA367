package MenuView;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class GameOverMenu extends JPanel {

    /**
     * A constructur for GameOverMenu.
     * @param drawGameOverMenu Draws menu-items such as game over title and current score.
     */
    public GameOverMenu(DrawGameOverMenu drawGameOverMenu){
        BorderLayout borderLayout = new BorderLayout();

        this.setBackground(Color.WHITE);
        this.setLayout(borderLayout);
        this.add(drawGameOverMenu);
        this.setVisible(true);
    }
}
