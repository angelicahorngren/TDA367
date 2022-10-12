package Model;

import Utilities.Constants;

public class Obstacle {
    public int width;
    public int height;
    public int speed;
    public int startXposition; //= Constants.OBSTACLE_START_X;
    public Shapes hitBox;
    public int xPosition;


    public Obstacle(int width, int height, int speed, int startXpos){
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.startXposition = startXpos;
        this.hitBox = new Shapes(startXpos, Constants.Y_POS, width, height);


    }

    public int move() {
        xPosition = startXposition + speed;

        if (xPosition > Constants.DISTANCE_OBSTACLE_TRAVELS + width) {
            xPosition = -width;
        }

        startXposition = xPosition;
        return xPosition;

    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return xPosition;
    }




}
