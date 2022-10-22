package View;

import Model.Player;
import java.awt.*;

public class DrawPlayer {

    private Player player;
    private Color color;

    public DrawPlayer(Player player) {

        this.player = player;
        this.color = Color.MAGENTA;
    }

    private void updatePlayerViewColor(){
        if (player.getPoweredUpStatus()) {
            this.color = Color.RED;
        }
        else{
            this.color = Color.MAGENTA;
        }
    }

    public void drawPlayer(Graphics g) {
        updatePlayerViewColor();
        Graphics2D gg = (Graphics2D) g;

        gg.setColor(this.color);
        gg.fillRect(player.getxPosition(), player.getyPosition(), player.getPlayerWidth(), player.getPlayerHeight());      //här sätts även yposition
    }

}






