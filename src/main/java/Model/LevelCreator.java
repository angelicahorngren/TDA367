package Model;

import Utilities.Constants;
import java.util.ArrayList;


public class LevelCreator {

    private ArrayList<Obstacle> obstacles;

    /**
     * A constructor for level one.
     * @param obstacles is the list that will here be filled with the obstacles of level one.
     */

    public LevelCreator(ArrayList<Obstacle> obstacles) {
        this.obstacles = obstacles;
    }

    /**
     * Adds the different obstacles to the list of obstacles in the specified order and starting positions.
     */
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



    /**
     * Gets the list of obstacles for level one.
     * @return the list of obstacles representing level one.
     */
    public ArrayList<Obstacle> getObstacleList(){
        return obstacles;
    }

    }



