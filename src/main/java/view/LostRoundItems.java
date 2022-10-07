package view;

import Utilities.Constants;
import view.IMenuItems;
import view.MenuButton;
import view.MenuText;

import java.util.ArrayList;

public class LostRoundItems {

    ArrayList<IMenuItems> lritems = new ArrayList<>();

    public LostRoundItems(){

        lritems.add(new MenuButton(Constants.MENU_BTN_POSX, Constants.MENU_BTN_POSY, Constants.MENU_BTN_WIDTH, Constants.MENU_BTN_HEIGHT, Constants.MENU_BTN_POSX + 6, Constants.MENU_BTN_POSY + 29, 15, "Menu"));
        lritems.add(new MenuButton(Constants.PLAY_AGAIN_BTN_POSX, Constants.PLAY_AGAIN_BTN_POSY, Constants.PLAY_AGAIN_BTN_WIDTH, Constants.PLAY_AGAIN_BTN_HEIGHT, Constants.PLAY_AGAIN_BTN_POSX + 5, Constants.PLAY_AGAIN_BTN_POSY + 29, 15, "Again"));
        lritems.add(new MenuText("Oops", 30, Constants.LOST_ROUND_VIEW_WIDTH - 245, Constants.LOST_ROUND_VIEW_HEIGHT - 150));
        lritems.add(new MenuText("This round: ", 20, Constants.LOST_ROUND_VIEW_WIDTH - 270, Constants.LOST_ROUND_VIEW_HEIGHT - 100));
    }

    public ArrayList<IMenuItems> getArrayList(){

        return lritems;

    }

}
