package Model;

import Utilities.Constants;

public class Obstacle implements IMovable{
    public int width;
    public int height;
    public int speed;
     //= Constants.OBSTACLE_START_X;
    //public Shapes hitBox;
    public int xPosition;
    public int yPosition;


    public Obstacle(int width, int height, int speed, int startXpos, int yPosition){
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.xPosition = startXpos;
        this.yPosition = yPosition;

    }

    public void move() {
        speed = -10;
        xPosition += speed;

        if (xPosition > Constants.DISTANCE_OBSTACLE_TRAVELS + width) {
            xPosition = -width;
        }

    }

    public void remove(){
        this.yPosition = 900;
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
        return yPosition;
    }




}
