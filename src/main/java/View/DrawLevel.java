package View;

import Model.LevelOne;
import Model.Obstacle;
import Model.Projectile;

import java.awt.*;
import java.util.ArrayList;

public class DrawLevel {

    private ArrayList<Obstacle> levelOne;


    public DrawLevel(ArrayList<Obstacle> levelOne){
        this.levelOne = levelOne;
    }

    public void drawLevel(Graphics g){
        if(levelOne.size() != 0){
            for(Obstacle obstacle : levelOne){
                g.setColor(new Color(0, 0, 0));
                g.fillRect(obstacle.getxPosition(), obstacle.getyPosition(), obstacle.getHeight(), obstacle.getWidth());
            }
        }
    }


}
