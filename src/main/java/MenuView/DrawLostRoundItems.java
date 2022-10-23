package MenuView;

import Model.Score;

import javax.swing.*;
import java.awt.*;

public class DrawLostRoundItems extends JComponent {

    private LostRoundItemsList lostRoundItemsList;

    public DrawLostRoundItems(Score score){

        lostRoundItemsList = new LostRoundItemsList(score);


    }

    @Override
    protected void paintComponent(Graphics g) {

        for (IDraw lostRoundPageItems: lostRoundItemsList.getLostRoundPageItemsArrayList()){

            lostRoundPageItems.draw(g);
        }

    }

}
