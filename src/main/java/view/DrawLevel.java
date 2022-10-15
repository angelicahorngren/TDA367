package view;

import Model.LevelOne;
import Model.Obstacle;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawLevel extends JPanel{

    LevelOne levelOne;
    public ArrayList<Obstacle> testList;


    public DrawLevel(LevelOne levelOne){
        this.levelOne = levelOne;

    }



    public void drawLevelOne(Graphics g, LevelOne levelOne){
        super.paintComponent(g);
        for(Obstacle obstacle : testList){
            System.out.println(obstacle.getxPosition());
            g.fillRect(obstacle.getxPosition(), obstacle.getyPosition(), obstacle.getWidth(), obstacle.getHeight());
            g.setColor(Color.black);
        }
    }
}
