package Model;

import Utilities.Constants;
import View.DrawCircView;
import View.DrawRectView;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;


public class LevelOne {

    private ArrayList<Obstacle> obstacles;

    public LevelOne(ArrayList<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    public void createLevel(ArrayList<Obstacle> obstacles){
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 400, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 800, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 1200, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 2000, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 2500, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 2500 + Constants.RECT_WIDTH - 1, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 2500 + Constants.RECT_WIDTH*2 - 1, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 3000, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, 2*Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, true, Constants.OBSTACLE_START_X + 4000, Constants.OBSTACLE_START_Y-Constants.RECT_HEIGHT));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, 2*Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, true, Constants.OBSTACLE_START_X + 4500, Constants.OBSTACLE_START_Y-Constants.RECT_HEIGHT));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, 2*Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, true, Constants.OBSTACLE_START_X + 4800, Constants.OBSTACLE_START_Y-Constants.RECT_HEIGHT));

    }
        /*public void remove (Obstacle obstacle){
            levelOne.remove(obstacle);
        }
        public Obstacle getThisObstacle(){
            return obstacle;
        }

         */


    }



