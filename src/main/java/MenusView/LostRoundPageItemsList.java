package MenusView;

import Utilities.Constants;

import java.util.ArrayList;

public class LostRoundPageItemsList {

    private ArrayList<IDrawMenuItems> lostRoundPageItems = new ArrayList<>();

    public LostRoundPageItemsList(){

        lostRoundPageItems.add(new DrawButton(Constants.MENU_BTN_POSX, Constants.MENU_BTN_POSY, Constants.MENU_BTN_WIDTH, Constants.MENU_BTN_HEIGHT, Constants.MENU_BTN_POSX + 6, Constants.MENU_BTN_POSY + 29, 15, "Menu"));
        lostRoundPageItems.add(new DrawButton(Constants.PLAY_AGAIN_BTN_POSX, Constants.PLAY_AGAIN_BTN_POSY, Constants.PLAY_AGAIN_BTN_WIDTH, Constants.PLAY_AGAIN_BTN_HEIGHT, Constants.PLAY_AGAIN_BTN_POSX + 5, Constants.PLAY_AGAIN_BTN_POSY + 29, 15, "Again"));
        lostRoundPageItems.add(new DrawText("Oops", 30, Constants.LOST_ROUND_VIEW_WIDTH - 245, Constants.LOST_ROUND_VIEW_HEIGHT - 150));
        lostRoundPageItems.add(new DrawText("This round: ", 20, Constants.LOST_ROUND_VIEW_WIDTH - 270, Constants.LOST_ROUND_VIEW_HEIGHT - 100));
    }

    public ArrayList<IDrawMenuItems> getLostRoundPageItemsArrayList(){

        return lostRoundPageItems;

    }

}
