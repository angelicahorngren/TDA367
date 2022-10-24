package Controller;

import View.ViewContainer;
import java.awt.event.ActionEvent;

public class MenuButtonController extends MenuController {

    /**
     * Constructor for MenuButtonController.
     * @param viewContainer is used to switch to StartMenu -view from the controller.
     */
    public MenuButtonController(ViewContainer viewContainer){

        super(viewContainer);

    }

    /**
     * ActionListener that listens for input from user.
     * @param e Tells if an action has occurred on a component.
     */
    @Override
    public void actionPerformed(ActionEvent e) {

        viewContainer.goToStartPage();
    }

}
