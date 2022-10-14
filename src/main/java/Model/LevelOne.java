package Model;

import view.DrawCircView;
import view.DrawRectView;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;


public class LevelOne {

    //public Collection list = new ArrayList();
    //public List list = new ArrayList();

    Collection<JComponent> collection;

    public LevelOne(Obstacle obstacle) {
        Collection<JComponent> collection = new ArrayList<JComponent>(); //byt från string till obstacle eller liknande
        DrawRectView rectInList = new DrawRectView(obstacle);
        DrawCircView circleInList = new DrawCircView(obstacle);
        collection.add(rectInList);                                 //lägg till de olika hindren här
        collection.add(circleInList);
        collection.add(rectInList);

        // for-each loop
      /*  for (JComponent s : collection) {
            //System.out.println(collection); //lägg till nåt sätt att chilla lite innan den tar nästa hinder i kön
         s.repaint();

        }*/
    }

    public Collection<JComponent> GetList() {
        return collection;
    }
}


