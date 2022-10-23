package MenuView;

import Model.Score;

import java.util.ArrayList;

public class LostRoundItemsList {

    private ArrayList<IDraw> lostRoundItems = new ArrayList<>();

    public LostRoundItemsList(Score score){

        //lostRoundItems.add(new DrawButton(Constants.MENU_BTN_POSX, Constants.MENU_BTN_POSY, Constants.MENU_BTN_WIDTH, Constants.MENU_BTN_HEIGHT, Constants.MENU_BTN_POSX + 6, Constants.MENU_BTN_POSY + 29, 15, "Menu"));
        //lostRoundItems.add(new DrawButton(Constants.PLAY_AGAIN_BTN_POSX, Constants.PLAY_AGAIN_BTN_POSY, Constants.PLAY_AGAIN_BTN_WIDTH, Constants.PLAY_AGAIN_BTN_HEIGHT, Constants.PLAY_AGAIN_BTN_POSX + 5, Constants.PLAY_AGAIN_BTN_POSY + 29, 15, "Again"));
        lostRoundItems.add(new DrawText("Oops, You lost", 50, 230, 100));
        lostRoundItems.add(new DrawText("score this round: ", 20, 300, 150));
        lostRoundItems.add(new DrawScore(score.getCurrentScore(), 20, 485, 150));
    }

    public ArrayList<IDraw> getLostRoundPageItemsArrayList(){

        return lostRoundItems;

    }

}
