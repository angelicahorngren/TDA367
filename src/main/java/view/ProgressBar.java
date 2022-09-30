package view;

import Utilities.Constants;

import java.awt.*;
import javax.swing.*;


public class ProgressBar extends JProgressBar {

    double x = 0;
    int counter = 0;

    public ProgressBar() {


        this.setStringPainted(true); // show the percentage on the bar
        this.setFont(new Font("MV Boli", Font.BOLD, 10)); // customize the bar
        this.setForeground(Color.red); // set the fill color of the bar
        this.setBackground(Color.WHITE); // set the background color of the bar



    }

    public double getIncreasedTime(double milliSeconds) {
        double increase = 1000 / milliSeconds;
        return increase;
    }

    public void updatetime() {
        while (x % 1 != 0.0 || x == 0.0) {
            x = (x + getIncreasedTime(Constants.SEC_LV1));
            x = Math.round(x * 1000000000d) / 1000000000d;
            break;
        }
    }

    public void increaseIfWholeNumber() {
        if (x % 1 == 0.0) {

            counter += 1;
            x = 0;
        }
    }

    public void setUpdatedCounter(){

        this.setValue(counter);
    }

    public void setProgressbarBounds(){
        this.setBounds(200,10, 400, 10);

    }



}
