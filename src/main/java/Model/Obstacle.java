package Model;

import Utilities.Constants;

public class Obstacle implements IMovable{
    protected int width;
    protected int height;
    protected int speed;
     //= Constants.OBSTACLE_START_X;
    //public Shapes hitBox;
    protected int xPosition;
    protected int yPosition;
    protected boolean isDestroyable;


    public Obstacle(int width, int height, int speed, boolean isDestroyable, int startXpos, int yPosition){
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.xPosition = startXpos;
        this.yPosition = yPosition;
        this.isDestroyable = isDestroyable;
       // this.hitBox = new Shapes(startXpos, Constants.Y_POS, width, height);

    }

    public void move() {
        xPosition += speed;

        if (xPosition > Constants.DISTANCE_OBSTACLE_TRAVELS + width) {
            xPosition = -width;
        }

    }

    public void remove(){
        this.yPosition = 900;
    }

    public int getSpeed(){
        return speed;
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



    public void runObstacleSystem(){
        move();
    }



}
