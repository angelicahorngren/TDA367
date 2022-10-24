package Controller;

import Utilities.Constants;
import View.ViewContainer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public abstract class MenuController implements ActionListener {

    public ViewContainer viewContainer;

    MenuController(ViewContainer viewContainer){
        this.viewContainer = viewContainer;

    }

   public void actionPerformed(ActionEvent e){}

}
