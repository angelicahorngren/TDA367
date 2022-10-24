package Controller;

import View.ViewContainer;
import main.GameLoop;
import java.awt.event.ActionEvent;

public class PlayButtonController extends MenuController {


    private GameLoop gameLoop;

    /**
     * Constructor for PlayButtonController.
     * @param gameLoop is the game loop of the game that updates every 10 milliseconds.
     * @param viewContainer is the container that holds the 3 views: gameview, startmenu, gameovermenu.
     */
    public PlayButtonController(GameLoop gameLoop, ViewContainer viewContainer){

        super(viewContainer);
        this.gameLoop = gameLoop;

    }

    /**
     * ActionListener that listens for input from user.
     * @param e Tells if an action has occurred on a component and will then start the game.
     */
    @Override
    public void actionPerformed(ActionEvent e) {
        GameLoop.Thread_argument_ms = 10;
        Thread thread = new Thread(gameLoop);
        viewContainer.startGame();
        thread.start();
    }



}
