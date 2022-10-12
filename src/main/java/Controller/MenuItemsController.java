package Controller;
import Model.Obstacle;
import Model.Player;
import Utilities.Constants;
import view.GameView;
import view.MenuView;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class MenuItemsController extends MouseAdapter {

    private int buttonPosX; //Constants.START_BTN_POSX
    private int buttonPosY; //Constants.START_BTN_POSY
    private int buttonWidth; //Constants.START_BTN_WIDTH
    private int buttonHeight; //Constants.START_BTN_HEIGHT
    Player player;
    Obstacle obstacle;
    GameView gm;

    public MenuItemsController(int buttonPosX, int buttonPosY, int buttonWidth, int buttonHeight, Player player, Obstacle obstacle, GameView gm) {

        this.buttonPosX = buttonPosX;
        this.buttonPosY = buttonPosY;
        this.buttonWidth = buttonWidth;
        this.buttonHeight = buttonHeight;

        this.player = player;
        this.obstacle = obstacle;

        this.gm = gm;

    }

    @Override
    public void mouseClicked(MouseEvent e) {

        int mousex = e.getX();
        int mousey = e.getY();

        if (mousex >= buttonPosX && mousex <= buttonPosX + buttonWidth) {

            if (mousey >= buttonPosY && mousey <= buttonPosY + buttonHeight) {


                if ( buttonPosX == Constants.START_BTN_POSX || buttonPosX == Constants.PLAY_AGAIN_BTN_POSX){

                    //switch to gameview
                    //new GameView(player, obstacle);
                    gm.toFront(); //funkar det här?

                }

                else if (buttonPosX == Constants.MENU_BTN_POSX){

                    //switch to startpage
                    //new MenuView(player, obstacle, null);

                }
            }
        }
    }




}
