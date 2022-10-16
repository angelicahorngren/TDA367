package Utilities;

import java.awt.*;

public class Constants {
    //Jframe
    public static final int SCREEN_HEIGHT = 400;
    public static final int SCREEN_WIDTH = 800;
    public static final String SCREEN_TITLE = "JumpNStuff";

    //Game items
    public static final int RECT_WIDTH = 50;
    public static final int RECT_HEIGHT = 50;
    public static final int PLAYER_START_X = 400;
    public static final int RECT_START_X = 1000;
    public static final Color RECT_COLOR = Color.RED;
    public static final int Y_POS = 250;
    public static final int CIRC_START_X = 1500;
    public static final int DISTANCE_OBSTACLE_TRAVELS = 3000;                       //skärmens bredd (osynlig+synlig)

    public static final int OBSTACLE_START_X = 1600;
    public static final int OBSTACLE_SPEED = -3;
    public static final int OBSTACLE_START_Y = 250;

    //Timer
    public static int Thread_argument_ms = 10;

    public static final double SEC_LV1 = 5000;

    //Lost round jframe
    public static final int LOST_ROUND_VIEW_WIDTH = (SCREEN_WIDTH / 2);
    public static final int LOST_ROUND_VIEW_HEIGHT = (SCREEN_HEIGHT / 2);


    //Menu items
    public static final int BORDER_THICKNESS = 2;

    public static final int START_BTN_WIDTH = 150;
    public static final int START_BTN_HEIGHT = 50;
    public static final int START_BTN_POSX = (SCREEN_WIDTH - 150) / 2;
    public static final int START_BTN_POSY = (SCREEN_HEIGHT - 170);

    public static final int MENU_BTN_WIDTH = 50;
    public static final int MENU_BTN_HEIGHT = 50;
    public static final int MENU_BTN_POSX = (LOST_ROUND_VIEW_WIDTH / 2) - 120;
    public static final int MENU_BTN_POSY = (LOST_ROUND_VIEW_HEIGHT - 80);

    public static final int PLAY_AGAIN_BTN_WIDTH = 50;
    public static final int PLAY_AGAIN_BTN_HEIGHT = 50;
    public static final int PLAY_AGAIN_BTN_POSX = (LOST_ROUND_VIEW_WIDTH / 2) + 70;
    public static final int PLAY_AGAIN_BTN_POSY = (LOST_ROUND_VIEW_HEIGHT - 80);


    public static final int GRAVITY = 10;

}

