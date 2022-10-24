package Model;

import Utilities.Constants;

import static main.GameLoop.Thread_argument_ms;

public class PowerUp implements IMovable {

    private boolean powerOn = false;

    //Timer
    private int powerUpTimer = 0;

    private int width;
    private int height;
    private int speed;
    private int xPosition;
    private int yPosition;
    private int startXpos;

    /**
     * The constructor for the PowerUp.
     * @param width the width of the PowerUp.
     * @param height the height of the PowerUp.
     * @param speed the speed of the PowerUp.
     * @param startXpos the starting position on the x-axis for the PowerUp.
     * @param yPosition the position on the y-axis for the PowerUp.
     */

    public PowerUp(int width, int height, int speed, int startXpos, int yPosition) {
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.xPosition = startXpos;
        this.yPosition = yPosition;
        this.startXpos = startXpos;
    }

    /**
     *The PowerUp's move method specifies how it will move on the screen.
     */
    public void move() {
       // speed = -10;
        xPosition += speed;

        if (xPosition > Constants.DISTANCE_OBSTACLE_TRAVELS + width) {
            xPosition = -width;
        }
    }

    /**
     * Gets the width of the PowerUp.
     * @return the width of the PowerUp.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets the height of the PowerUp.
     * @return the height of the PowerUp.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets the x-axis position of the PowerUp.
     * @return the x-axis value of the PowerUp.
     */
    public int getxPosition() {
        return xPosition;
    }

    /**
     * Gets the y-axis position of the PowerUp.
     * @return the y-axis value of the PowerUp.
     */
    public int getyPosition() {
        return yPosition;
    }

    /**
     * Gets the powerup status of the PowerUp.
     * @return if the power is on or not.
     */
    public boolean getPowerUpStatus(){
        return powerOn;
    }

    /**
     * Sets powerOn to true.
     */
    public void setPowerUpOn(){
        powerOn = true;
    }

    /**
     * Sets the powerUpTimer to argument value when called.
     * @param timerValue is the value that is set as new powerUpTimer value. This is used for testing this class.
     */
    public void setPowerUpTimer(int timerValue){
        powerUpTimer = timerValue;
    }


    private void setPowerUpoff(){
        powerOn = false;
    }


    private void startPowerUpTimer() {
        powerUpTimer = powerUpTimer  + Thread_argument_ms;
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

    /**
     *Starts the move function of the PowerUp and if the power is on (true) starts the timer for the PowerUp effect duration and stops it after timer runs out.
     */
    public void runpowerUpSystem(){
        move();
        if (getPowerUpStatus()) {
            startPowerUpTimer();
            endPowerup();
        }
    }

    /**
     * Resets position of the powerUp to its initial value.
     */
    public void resetPowerUp(){
        xPosition = startXpos;
    }

}
