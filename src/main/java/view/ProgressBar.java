package view;

import Utilities.Constants;

import java.awt.*;
import javax.swing.*;


public class ProgressBar extends JProgressBar {

    double x = 0;
    int counter = 0;

    public ProgressBar() {

        this.setValue(0);
        this.setBounds(200, 2, 420, 20);

        this.setStringPainted(true); // show the percentage on the bar
        this.setFont(new Font("MV Boli", Font.BOLD, 10)); // customize the bar
        this.setForeground(Color.red); // set the fill color of the bar
        this.setBackground(Color.WHITE); // set the background color of the bar
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

    public double getIncreasedTime(double milliSeconds) {
        double increase = 1000 / milliSeconds;
        return increase;
    }

    public void updatetime() {
        while (x % 1 != 0.0 || x == 0.0) {
            x = (x + getIncreasedTime(Constants.SEC_LV1));
            x = Math.round(x * 1000000000d) / 1000000000d;
            //System.out.println(x);
            break;
        }
    }

    public void increaseIfWholeNumber() {
        if (x % 1 == 0.0) {

            counter += 1;
            x = 0;

        }
    }
}
