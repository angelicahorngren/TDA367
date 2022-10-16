package Model;

import view.DrawCircView;
import view.DrawRectView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;


public class LevelOne {

    Collection<JComponent> collection;
    Obstacle obstacle;

    public LevelOne(Obstacle obstacle) {
        this.obstacle = obstacle;
        Collection<JComponent> collection = new ArrayList<JComponent>(); //byt från string till obstacle eller liknande
        DrawRectView rectInList = new DrawRectView(obstacle);
        DrawCircView circleInList = new DrawCircView(obstacle);
        collection.add(rectInList);                                 //lägg till de olika hindren här
        collection.add(circleInList);
        collection.add(rectInList);

        // for-each loop
        for (JComponent s : collection) {
         s.repaint();

        }
    }

    public Collection<JComponent> GetList() {
        return collection;
    }

    public Obstacle getThisObstacle(){
        return obstacle;
    }
}


