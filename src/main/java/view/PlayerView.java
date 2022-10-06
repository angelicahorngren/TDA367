package view;

import Model.PlayerModel;
import Utilities.Constants;

import java.awt.*;

public class PlayerView {

    PlayerModel player;

    public PlayerView() {
        this.player = new PlayerModel();
    }

    public void drawPlayer(Graphics g) {
        Graphics2D gg = (Graphics2D) g;
        gg.setColor(Color.MAGENTA);
        gg.fillRect(Constants.PLAYER_START_X - 200, player.getYPosition(), player.playerWidth, player.playerHeight);      //här sätts även yposition
    }

}
