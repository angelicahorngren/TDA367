package MenuView;
import Model.Score;
import Utilities.Constants;

import java.util.ArrayList;

public class StartPageItemsList {

    private ArrayList<IDraw> startPageItems = new ArrayList<>();

    public StartPageItemsList(Score score){

        //startPageItems.add(new DrawButton(Constants.START_BTN_POSX, Constants.START_BTN_POSY, Constants.START_BTN_WIDTH, Constants.START_BTN_HEIGHT, Constants.START_BTN_POSX + 41, Constants.START_BTN_POSY + 35, 30, "Start"));
        startPageItems.add(new DrawText("JumpNStuff", 50, (Constants.SCREEN_WIDTH - 300) / 2, (Constants.SCREEN_HEIGHT - 200)/2));
        startPageItems.add(new DrawText("High Score : ", 40, (Constants.SCREEN_WIDTH - 300) / 2, (Constants.SCREEN_HEIGHT - 35) / 2));
        startPageItems.add(new DrawScore(score.getHighScore(), 40, 500, (Constants.SCREEN_HEIGHT - 35) / 2));

    }

    public ArrayList<IDraw> getStartPageItemsArrayList(){

        return startPageItems;

    }

}
