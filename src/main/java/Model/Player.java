package Model;

import Utilities.Constants;


public class Player implements IMovable{
    private int yPosition;
    private int velY;
    private final int playerWidth;
    private final int playerHeight;
    private int velReducer;
    private int xPosition;
    private boolean alive;
    private PowerUp powerUp;
    private Boolean isPoweredUp;


    /**
     * Constructor for Player.
     * @param playerWidth the width of the player.
     * @param playerHeight the height of the player.
     * @param yPosition the y-axis position of the player.
     * @param xPosition the x-axis position of the player.
     * @param alive the alive status of the player.
     */
    public Player(int playerWidth, int playerHeight, int yPosition, int xPosition, boolean alive, PowerUp powerUp) {
        this.playerWidth = playerWidth;
        this.playerHeight = playerHeight;
        this.yPosition = yPosition;
        this.alive = alive;
        this.xPosition = xPosition;
        this.powerUp = powerUp;
    }

    /**
     * Creates gravity for the player so that the player is always pulled to the ground level (but never below the ground) after jumping.
     */
    public void gravity() {
        if (yPosition < Constants.Y_POS) {
            velReducer++;
            if (velReducer % 2 == 0){
                velY++;
            }
            yPosition += velY;
        } else {
            yPosition = Constants.Y_POS;
            velY = 0;
            velReducer = 0;
        }
    }

    /**
     * Changes the player's y-axis position.
     */
    public void jump() {
        yPosition -= 10;
    }

    /**
     * Gets the y-axis position of the player.
     * @return the y-axis value of the player.
     */
    public int getyPosition() {
        return yPosition;
    }

    /**
     * Gets the player width.
     * @return the width of the player.
     */
    public int getPlayerWidth() {
        return playerWidth;
    }

    /**
     * Gets the player height.
     * @return the height of the player.
     */
    public int getPlayerHeight() {
        return playerHeight;
    }

    /**
     * Gets the x-axis position of the player.
     * @return the x-axis value of the player.
     */
    public int getxPosition() {
        return xPosition;
    }

    /**
     * Gets the alive-status for the player.
     * @return the alive status of the player.
     */
    public boolean getaliveStatus(){
        return alive;
    }


    /**
     * Gets the power up status of the player.
     * @return the powered up status.
     */
    public boolean getPoweredUpStatus(){
        return isPoweredUp;
    }

    /**
     *The player's move method specifies how it will move into the screen from the left in the beginning of the game.
     */
    public void move(){
        if(xPosition < 250){
            xPosition += 3;
        }

    }

    /**
     * Sets the alive status of the player to false.
     */
    public void setPlayerNotAlive(){
        alive = false;
    }

    /**
     * Sets the powered up status to true or false depending on if the power of the powerup is on or not.
     */
    private void setIsPoweredUp() {
        if (powerUp.getPowerUpStatus()) {
            isPoweredUp = true;
        }
        else isPoweredUp = false;
    }

    /**
     * Runs the methods to move the player into frame, cause gravity to the player, and set the powered up status correctly.
     */
    public void runPlayerSystem(){ //varför är de andra public och används när denna finns? ändra detta?
        gravity();
        move();
        setIsPoweredUp();
    }

}

