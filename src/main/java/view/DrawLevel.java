package view;

import Model.LevelOne;
import Model.Object;
import Utilities.Constants;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Collection;

public class DrawLevel extends JPanel{

    LevelOne levelOne;
    public ArrayList<Object> testList;


    public DrawLevel(LevelOne levelOne){
        this.levelOne = levelOne;

    }



    public void drawLevelOne(Graphics g, LevelOne levelOne){
        super.paintComponent(g);
        for(Object object : testList){
            System.out.println(object.getxPosition());
            g.fillRect(object.getxPosition(), object.getyPosition(), object.getWidth(), object.getHeight());
            g.setColor(Color.black);
        }
    }
}
