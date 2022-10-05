package view;

import Utilities.Constants;

import java.awt.*;
import javax.swing.*;


public class ProgressBar extends JProgressBar {

    double x = 0;               //x is initialized to 0
    int percentageOnBar = 0;    //the percentage on the progressbar is initialized to 0%

    public ProgressBar() {


        this.setStringPainted(true); // show the percentage on the bar
        this.setFont(new Font("MV Boli", Font.BOLD, 10)); // customize the bar
        this.setForeground(Color.red); // set the fill color of the bar
        this.setBackground(Color.WHITE); // set the background color of the bar



    }

    public double getIncreasedTime(double milliseconds) {
        return 1000 / milliseconds;                      //decides the amount x should increase by with each iteration depending on ->
                                                    //-> the current level pre-decided length
    }

    public void updateTime() {
        while (x % 1 != 0.0 || x == 0.0) {                      //"if x is not a whole number or if x equals 0: enter the while loop"
            x = (x + getIncreasedTime(Constants.SEC_LV1));      //updates the x value by a specific value depending on the pre-decided ->
                                                                //-> length of level 1 (this value is calculated in getIncreasedTime)
            x = Math.round(x * 1000000000d) / 1000000000d;      //rounds the number to a double with only 2 decimal places
            //System.out.println(x);
            break;                                              //break the loop to move on to "increaseIfWholeNumber"
        }
    }

    public void increaseIfWholeNumber() {
        if (x % 1 == 0.0) {
                                    //if x is a whole number with no decimals(in this case x will only ever equal 1.0): increase the progressbar percentage by 1
            percentageOnBar += 1;
            x = 0;                  //reset x to 0 so that the while-loop above will continue to be entered during the coming game-loop iterations
        }
    }

    public void setUpdatedCounter(){

        this.setValue(percentageOnBar);     //inserts the percentageOnBar -value in the progressbar class object
    }

    public void setProgressbarBounds(){
        this.setBounds(200,10, 400, 10);        //sets the bounds of the progressbar

    }



}
