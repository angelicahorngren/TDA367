package MenusView;
import Model.Score;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class LostRoundMenu extends JPanel {


    public LostRoundMenu(DrawLostRoundItems drawLostRoundItems){
        BorderLayout borderLayout = new BorderLayout();

        this.setBackground(Color.WHITE);
        this.setLayout(borderLayout);
        this.add(drawLostRoundItems);

        this.setPreferredSize(new Dimension(Constants.LOST_ROUND_VIEW_WIDTH, Constants.LOST_ROUND_VIEW_HEIGHT));
        this.setVisible(true);


    }

}
