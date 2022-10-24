package View;

import Model.Obstacle;
import java.awt.*;
import java.util.ArrayList;

public class DrawLevel implements IDraw{

    private ArrayList<Obstacle> levelOne;


    public DrawLevel(ArrayList<Obstacle> levelOne){
        this.levelOne = levelOne;
    }

    public void draw(Graphics g){
        if(levelOne.size() != 0){
            for(Obstacle obstacle : levelOne){
                if(obstacle.getIsDestroyable()){
                    g.setColor(new Color(60, 200, 180));
                }
                else{
                    g.setColor(new Color(0, 0, 0));
                }
                g.fillRect(obstacle.getxPosition(), obstacle.getyPosition(), obstacle.getWidth(), obstacle.getHeight());
            }
        }
    }


}
