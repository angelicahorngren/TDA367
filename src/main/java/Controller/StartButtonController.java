package Controller;

import Utilities.Constants;
import View.MainWindow;
import main.GameLoop;
import View.GameView;

import java.awt.event.MouseEvent;

public class StartButtonController extends MenuItemsController{

    private int buttonPosX;

    GameLoop gameLoop;
    public int x;
    GameView gameView;


    public StartButtonController(int x, int y, int width, int height, GameLoop gameLoop, GameView gameView){

        super(x, y, width, height);


        this.buttonPosX = x;
        this.gameLoop = gameLoop;
        this.gameView = gameView;


    }
    @Override
    public void mouseClicked(MouseEvent e) {

        int mousex = e.getX();
        int mousey = e.getY();
        this.x = 0;

        if (mousex >= buttonPosX && mousex <= buttonPosX + buttonWidth) {

            if (mousey >= buttonPosY && mousey <= buttonPosY + buttonHeight) {

                this.x=2;
                buttonPressed();

                System.out.println(this.x);

            }
        }
    }



    @Override
    public void buttonPressed(){


        if ( buttonPosX == Constants.START_BTN_POSX || buttonPosX == Constants.PLAY_AGAIN_BTN_POSX) {

            Thread thread = new Thread(gameLoop);
            thread.start();

            System.out.println("start");

        }

    }

    public int getXvalueStartBtn(){
        return this.x;
    }

}
