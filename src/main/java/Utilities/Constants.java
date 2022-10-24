package Utilities;

import java.awt.*;

public class Constants {
    //Jframe
    public static final int SCREEN_HEIGHT = 400;
    public static final int SCREEN_WIDTH = 800;
    public static final String SCREEN_TITLE = "JumpNStuff";

    //Start Menu
    public static final String START_MENU_TITLE_TEXT = "JumpNStuff";
    public static final int START_MENU_TITLE_SIZE = 50;
    public static final int START_MENU_TITLE_POS_X = 250;
    public static final int START_MENU_TITLE_POS_Y = 100;

    public static final String START_HIGH_SCORE_TEXT = "High Score : ";
    public static final int START_MENU_HIGH_SCORE_SIZE = 40;
    public static final int START_MENU_HIGH_SCORE_POS_X = 250;
    public static final int START_MENU_HIGH_SCORE_POS_Y = 180;

    public static final int START_MENU_SCORE_SIZE = 40;
    public static final int START_MENU_SCORE_POS_X = 500;
    public static final int START_MENU_SCORE_POS_Y = 180;

    //Game Over Menu
    public static final String GAME_OVER_MENU_TITLE_TEXT = "Oops, You lost";
    public static final int GAME_OVER_MENU_TITLE_SIZE = 50;
    public static final int GAME_OVER_MENU_TITLE_POS_X = 230;
    public static final int GAME_OVER_MENU_TITLE_POS_Y = 100;

    public static final String GAME_OVER_THIS_ROUND_TEXT = "score this round: ";
    public static final int GAME_OVER_MENU_THIS_ROUND_SIZE = 20;
    public static final int GAME_OVER_MENU_THIS_ROUND_POS_X = 300;
    public static final int GAME_OVER_MENU_THIS_ROUND_POS_Y = 150;

    public static final int GAME_OVER_MENU_SCORE_SIZE = 20;
    public static final int GAME_OVER_MENU_SCORE_POS_X = 485;
    public static final int GAME_OVER_MENU_SCORE_POS_Y = 150;

    //Game items
    public static final int RECT_WIDTH = 50;
    public static final int RECT_HEIGHT = 50;
    public static final int PLAYER_START_X = -200;
    public static final int RECT_START_X = 1000;
    public static final Color RECT_COLOR = Color.RED;
    public static final int Y_POS = 250;
    public static final int CIRC_START_X = 1500;
    public static final int DISTANCE_OBSTACLE_TRAVELS = 3000;                       //skärmens bredd (osynlig+synlig)

    public static final int OBSTACLE_START_X = 3000;
    public static final int OBSTACLE_SPEED = -10;
    public static final int OBSTACLE_START_Y = 250;

    // Power up items
    public static final int POWERUP_WIDTH = 20;
    public static final int POWERUP_HEIGHT = 30;
    public static final Color POWERUP_COLOR = new Color(0x03036D);
    public static final int POWERUP_START_Y = 250;
    public static final int POWERUP_START_X = 1500;
    public static final int POWERUP_SPEED = -3;
    public static final int DISTANCE_POWERUP_TRAVELS = 3000;                       //skärmens bredd (osynlig+synlig)






    //Timer
    public static int Thread_argument_ms = 10;

    public static final double SEC_LV1 = 10000;

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


}

