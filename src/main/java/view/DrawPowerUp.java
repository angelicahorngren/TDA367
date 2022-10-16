package view;
import Model.Obstacle;
import Model.PowerUp;
import Utilities.Constants;

import java.awt.*;


public class DrawPowerUp {
    PowerUp powerUp;

    public DrawPowerUp(PowerUp powerUp){
        this.powerUp = powerUp;
    }

    public void drawPowerup(Graphics g) {

        Graphics2D gg = (Graphics2D) g;


        gg.setColor(Constants.POWERUP_COLOR);
        gg.fillRect(powerUp.getxPosition(), Constants.Y_POS, powerUp.width, powerUp.height);      //här sätts även yposition



    }


}
