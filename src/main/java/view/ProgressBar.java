package view;

import Utilities.Constants;

import java.awt.*;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Arrays;
import javax.swing.*;


public class ProgressBar extends JProgressBar {

    boolean angelica =false;

    public int counter = 0;


    public ProgressBar() {

        this.setValue(0);
        this.setBounds(10, 10, 100, 10);

        this.setStringPainted(true); // show the percentage on the bar
        this.setFont(new Font("MV Boli", Font.BOLD, 10)); // customize the bar
        this.setForeground(Color.red); // set the fill color of the bar
        this.setBackground(Color.BLACK); // set the background color of the bar
        UIManager.put("ProgressBar.selectionBackground", Color.red);


    }

    public void fill() {
        int counter = 0;
        while (counter <= 100) {
            this.setValue(counter);
            try {
                Thread.sleep(1000); // 1000 = 1 second
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            counter += 1;
        }

    }

    public double getIncreasedTime(double seconds) {
        double increase = 1000 / seconds;
        return increase;
    }

    public boolean timeUpdate() {
        double x = 0;

        while (x % 1 != 0.0 || x == 0.0) {
            x = (x + getIncreasedTime(Constants.SEC_LV1));
            x = Math.round(x * 1000000000d) / 1000000000d;
            //System.out.println(x);
            break;
        }
        if (x % 1 != 0.0) {
            return false;
        } else return true;
    }
}

   /* public void makeAngelicafalse(){
        angelica = false;
    }


    public void makeFalse () {


    }


}*/
