package Model;
import Utilities.Constants;


public class DrawCircModel {
    public int cWidth;
    public int cHeight;
    public int cSpeed;
    public int x_pos_circle = Constants.CIRC_START_X;
    int w = 1500;   //skärmens bredd (osynlig+synlig)


    public DrawCircModel(int h, int w) {
        cWidth = w;
        cHeight = h;
        cSpeed = -3;
    }

    public int move(){

        int u = x_pos_circle + cSpeed;

        if (u > w + cWidth) {
            u = -cWidth;
        }
        x_pos_circle = u;
        return u;

    }

}
