package Controller;

import View.ViewContainer;
import main.GameLoop;

import java.awt.event.ActionEvent;

public class PlayButtonController extends MenuController {


    private GameLoop gameLoop;

    public PlayButtonController(GameLoop gameLoop, ViewContainer viewContainer){

        super(viewContainer);
        this.gameLoop = gameLoop;



    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Thread thread = new Thread(gameLoop);
        viewContainer.startGame();
        thread.start();
    }



}
