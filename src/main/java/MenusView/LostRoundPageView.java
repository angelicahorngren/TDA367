package MenusView;
import Utilities.Constants;
import javax.swing.*;
import java.awt.*;

public class LostRoundPageView extends JPanel {


    public LostRoundPageView(DrawLostRoundPageItems drawLostRoundPageItems){
        BorderLayout borderLayout = new BorderLayout();

        this.setBackground(Color.WHITE);
        this.setLayout(borderLayout);
        this.add(drawLostRoundPageItems);

        this.setPreferredSize(new Dimension(Constants.LOST_ROUND_VIEW_WIDTH, Constants.LOST_ROUND_VIEW_HEIGHT));
        this.setVisible(true);


    }

}
