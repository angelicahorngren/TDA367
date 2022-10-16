package view;

import Model.LevelOne;
import javax.swing.*;
import java.awt.*;
import java.util.Collection;

public class DrawLevel {

    LevelOne levelOne;
    public DrawLevel(LevelOne levelOne){
        this.levelOne = levelOne;


    }


    public void drawLevelOne(Graphics g) {
        Graphics2D gg = (Graphics2D) g;

        Collection<JComponent> x =  levelOne.GetList();
        for (JComponent s : x){
            gg.setColor(Color.red);
            gg.fillRect(s.getX(), s.getY(), s.getWidth(), s.getHeight());
        }

    }
}