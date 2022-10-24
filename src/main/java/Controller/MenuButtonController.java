package Controller;

import View.ViewContainer;

import java.awt.event.ActionEvent;

public class MenuButtonController extends MenuController {

    public MenuButtonController(ViewContainer viewContainer){

        super(viewContainer);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        viewContainer.goToStartPage();
    }

}
