package view;

import Utilities.Constants;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class LostRoundItems extends JComponent {

    ArrayList<IMenuItems> lritems = new ArrayList<>();

    public LostRoundItems(){

        lritems.add(new MenuButtonRectangle(Constants.MENU_BTN_POSX, Constants.MENU_BTN_POSY, Constants.MENU_BTN_WIDTH, Constants.MENU_BTN_HEIGHT));
        lritems.add(new PlayAgainButtonRectangle(Constants.PLAY_AGAIN_BTN_POSX, Constants.PLAY_AGAIN_BTN_POSY, Constants.PLAY_AGAIN_BTN_WIDTH, Constants.PLAY_AGAIN_BTN_HEIGHT));
        lritems.add(new OopsText());
        lritems.add(new ProgressText());

    }

    @Override
    protected void paintComponent(Graphics g) {

        for (IMenuItems i: lritems){
            i.draw(g);
        }

    }

}
