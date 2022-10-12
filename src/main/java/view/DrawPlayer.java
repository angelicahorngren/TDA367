package view;

import Model.Player;

import java.awt.*;

public class DrawPlayer {

    Player player;

    public DrawPlayer(Player player) {
        this.player = player;
    }

    public void drawPlayer(Graphics g) {
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(Color.MAGENTA);
        gg.fillRect(player.getXPosition(), player.getYPosition(), player.playerWidth, player.playerHeight);      //här sätts även yposition
    }

}
