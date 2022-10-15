package Model;

import Utilities.Constants;


public class Player {
    public int yPosition;
    public int velY;
    public int playerWidth;
    public int playerHeight;
    public int velReducer;
    public int xPosition;
    public boolean alive;



    public Player(int playerWidth, int playerHeight, int yPosition, int xPosition, boolean alive) {
        this.playerWidth = playerWidth;
        this.playerHeight = playerHeight;
        this.yPosition = yPosition;
        this.alive = alive;
        this.xPosition = xPosition;

    }

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

    public void jump() {
        if(xPosition >= 250){
            yPosition -= 10;
        }
    }


    public int getyPosition() {
        return yPosition;
    }

    public int getPlayerWidth() {
        return playerWidth;
    }

    public int getPlayerHeight() {
        return playerHeight;
    }

    public int getxPosition() {
        return xPosition;
    }

    public void moveIntoFrame(){
        if(xPosition < 250){
            xPosition += 4;
        }

    }

    public void setPlayerNotAlive(){
        alive = false;
    }






}

