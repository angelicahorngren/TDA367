package Controller;

import View.ViewContainer;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public abstract class MenuController implements ActionListener {

    public ViewContainer viewContainer;

    /**
     * Constructor for the MenuController.
     * @param viewContainer is the container of the 3 different views in the game: gameview, startmenu and gameovermenu.
     */
   public MenuController(ViewContainer viewContainer){
        this.viewContainer = viewContainer;

    }

    /**
     * ActionListener that listens for input from user.
     * @param e Tells if an action has occurred on a component.
     */
   public void actionPerformed(ActionEvent e){}

}
