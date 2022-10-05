package Model;
import Utilities.Constants;



public class DrawRectModel {
    public int rWidth;
    public int rHeight;
    public int rSpeed;
    public int X_POS = Constants.RECT_START_X;         //startposition för kvadraten xled

    int w = 1500;                       //skärmens bredd (osynlig+synlig)

    public DrawRectModel(int h, int w) {
        rWidth = w;
        rHeight = h;
        rSpeed = -3;

    }
    public int moveRect() {
        int x = X_POS + rSpeed;

        if (x > w + rWidth) {
            x = -rWidth;
        }

        X_POS = x;
        return x;


    }
}
