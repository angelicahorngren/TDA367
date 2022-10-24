package View;

import Model.Player;
import java.awt.*;

public class DrawPlayer implements IDraw {

    private Player player;
    private Color color;

    /**
     * A constructor for DrawPlayer
     * @param player used to get the player object that needs to be drawn
     */
    public DrawPlayer(Player player) {

        this.player = player;
        this.color = Color.MAGENTA;
    }

    /**
     * This method is used to change the color of the player if the player gets a power up
     */
    private void updatePlayerViewColor(){
        if (player.getPoweredUpStatus()) {
            this.color = Color.RED;
        }
        else{
            this.color = Color.MAGENTA;
        }
    }

    /**
     * used to draw and color the player object
     * @param g a neccasery parameter used to draw on a Jpanel
     */

    public void draw(Graphics g) {
        updatePlayerViewColor();
        Graphics2D gg = (Graphics2D) g;

        gg.setColor(this.color);
        gg.fillRect(player.getxPosition(), player.getyPosition(), player.getPlayerWidth(), player.getPlayerHeight());      //här sätts även yposition
    }

}






