package Model;

import Utilities.Constants;

public class PowerUp implements IMovable {

    private boolean powerOn = false;

    //Timer
    private int powerUpTimer = 0;

    private int width;
    private int height;
    private int speed;
    private int xPosition;
    private int yPosition;

    public PowerUp(int width, int height, int speed, int startXpos, int yPosition) {
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.xPosition = startXpos;
        this.yPosition = yPosition;
    }

    public void move() {
       // speed = -10;
        xPosition += speed;

        if (xPosition > Constants.DISTANCE_OBSTACLE_TRAVELS + width) {
            xPosition = -width;
        }
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

    public boolean getPowerUpStatus(){
        return powerOn;
    }


    public void setPowerUpOn(){
        powerOn = true;
    }

    public void setPowerUpTimer(int timerValue){
        powerUpTimer = timerValue;
    }

    private void setPowerUpoff(){
        powerOn = false;
    }


    private void startPowerUpTimer() {
        powerUpTimer = powerUpTimer  + Constants.Thread_argument_ms;
    }


    private void resetTime(){
        powerUpTimer = 0;
    }


    private void endPowerup(){
        if (powerUpTimer >= 3000){
            setPowerUpoff();
            resetTime();
        }
    }

    public void runpowerUpSystem(){
        move();
        if (getPowerUpStatus()) {
            startPowerUpTimer();
            endPowerup();
        }
    }

}
