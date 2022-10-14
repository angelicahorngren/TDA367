package Model;

import Utilities.Constants;
import view.DrawCircView;
import view.DrawRectView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;


public class LevelOne {


    Collection<Object> levelOne;


    //public List list = new ArrayList();


    public LevelOne(Object object){

        Collection<JComponent> collection = new ArrayList<JComponent>(); //byt från string till obstacle eller liknande
        DrawRectView rectInList = new DrawRectView(object);
        DrawCircView circleInList = new DrawCircView(object);
        collection.add(rectInList);                                 //lägg till de olika hindren här
        collection.add(circleInList);
        collection.add(rectInList);


        levelOne = new ArrayList();
        levelOne.add(new Object(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, Constants.OBSTACLE_START_X, Constants.OBSTACLE_START_Y));
        levelOne.add(new Object(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, Constants.OBSTACLE_START_X + 100, Constants.OBSTACLE_START_Y));
        levelOne.add(new Object(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, Constants.OBSTACLE_START_X + 200, Constants.OBSTACLE_START_Y));

    }

    public Collection<JComponent> getList() {
        return null;
        //return collection;
    }


}


