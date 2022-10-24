package View;
import Model.PowerUp;
import Utilities.Constants;
import java.awt.*;


public class DrawPowerUp implements IDraw {
    private PowerUp powerUp;

    public DrawPowerUp(PowerUp powerUp){
        this.powerUp = powerUp;
    }

    public void draw(Graphics g) {

        Graphics2D gg = (Graphics2D) g;


        gg.setColor(Constants.POWERUP_COLOR);
        gg.fillRect(powerUp.getxPosition(), Constants.Y_POS, powerUp.getWidth(), powerUp.getHeight());      //här sätts även yposition



    }


}
