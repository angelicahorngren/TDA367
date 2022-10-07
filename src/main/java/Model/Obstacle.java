package Model;

import Utilities.Constants;

public class Obstacle {
    public int Width;
    public int Height;
    public int Speed;
    public int startXposition = Constants.OBSTACLE_START_X;

    public Obstacle(int width, int height, int speed, int startXpos){
        this.Width = width;
        this.Height = height;
        this.Speed = speed;
        this.startXposition = startXpos;

    }

    public int move() {
        int x = startXposition + Speed;

        if (x > Constants.DISTANCE_OBSTACLE_TRAVELS + Width) {
            x = -Width;
        }

        startXposition = x;
        return x;



    }
}
