package Model;
import view.*;
import Utilities.Constants;
import java.util.ArrayList;

public class MenuItemsModel {
    ArrayList<IMenuItems> items = new ArrayList<>();

    public MenuItemsModel(){

        items.add(new MenuButton(Constants.START_BTN_POSX, Constants.START_BTN_POSY, Constants.START_BTN_WIDTH, Constants.START_BTN_HEIGHT, Constants.START_BTN_POSX + 41, Constants.START_BTN_POSY + 35, 30, "Start"));
        items.add(new MenuText("JumpNStuff", 50, (Constants.SCREEN_WIDTH - 260)/2, (Constants.SCREEN_HEIGHT - 200)/2));
        items.add(new MenuText("High Score : ", 40, (Constants.SCREEN_WIDTH - 300) / 2, (Constants.SCREEN_HEIGHT - 35) / 2));
        //items.add(new MenuText(Score.getHighScore(), 40, (Constants.SCREEN_WIDTH - 200) / 2, (Constants.SCREEN_HEIGHT - 35) / 2));
        // MenuText för highScore m.h.a. score() och toString

    }

    public ArrayList<IMenuItems> getArrayList(){

        return items;

    }

}
