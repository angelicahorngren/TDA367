package Model;

import Utilities.Constants;
import java.util.ArrayList;


public class LevelOne {

    private ArrayList<Obstacle> obstacles;

    public LevelOne(ArrayList<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    public void createLevel(){
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 400, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 800, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 1200, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 2000, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 2500, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 2500 + Constants.RECT_WIDTH - 1, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 2500 + Constants.RECT_WIDTH*2 - 1, Constants.OBSTACLE_START_Y));
        obstacles.add(new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED, false, Constants.OBSTACLE_START_X + 3000, Constants.OBSTACLE_START_Y));
    }

    public ArrayList<Obstacle> getObstacleList(){
        return obstacles;
    }

    }



