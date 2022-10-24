package View;
import Model.PowerUp;
import Utilities.Constants;
import java.awt.*;


public class DrawPowerUp implements IDraw {
    private PowerUp powerUp;


    /**
     * A constructor for DrawPowerUp
     * @param powerUp used to get the powerup that needs to be drawn
     */
    public DrawPowerUp(PowerUp powerUp){
        this.powerUp = powerUp;
    }

    /**
     * Method that draw and color all the power up object in the first level
     * @param g  a neccasery parameter used to draw on a Jpanel
     */
    public void draw(Graphics g) {

        Graphics2D gg = (Graphics2D) g;


        gg.setColor(Constants.POWERUP_COLOR);
        gg.fillRect(powerUp.getxPosition(), Constants.Y_POS, powerUp.getWidth(), powerUp.getHeight());      //här sätts även yposition



    }


}
