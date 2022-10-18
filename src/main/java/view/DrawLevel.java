package view;

import Model.LevelOne;
import Model.Obstacle;

import javax.swing.*;
import java.awt.*;
import java.util.Collection;
import java.util.ArrayList;

public class DrawLevel /* extends JPanel?*/{
    private LevelOne levelOne;
    private ArrayList<Obstacle> testList;


    public DrawLevel(LevelOne levelOne){
        this.levelOne = levelOne;


    }


  /*  public void drawLevelOne(Graphics g) {
        Graphics2D gg = (Graphics2D) g;

        Collection<JComponent> x =  levelOne.GetList();
        for (JComponent s : x){
            gg.setColor(Color.red);
            gg.fillRect(s.getX(), s.getY(), s.getWidth(), s.getHeight());
        }

    }*/
}
/* om drawlevel är en jpanel så funkar detta

 public void drawLevelOne(Graphics g, LevelOne levelOne){
        super.paintComponent(g);
        for(Obstacle obstacle : testList){
            System.out.println(obstacle.getxPosition());
            g.fillRect(obstacle.getxPosition(), obstacle.getyPosition(), obstacle.getWidth(), obstacle.getHeight());
            g.setColor(Color.black);
        }
    }
}

 */
