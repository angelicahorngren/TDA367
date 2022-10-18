package View;

import Model.Player;

import java.awt.*;

public class DrawPlayer {

    private Player player;

    public DrawPlayer(Player player) {
        this.player = player;
    }

    public void drawPlayer(Graphics g) {
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(Color.MAGENTA);
        gg.fillRect(player.getxPosition(), player.getyPosition(), player.getPlayerWidth(), player.getPlayerHeight());      //här sätts även yposition
    }

}
