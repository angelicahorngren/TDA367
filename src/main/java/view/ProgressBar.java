package view;

import Model.ProgressIndicator;
import java.awt.*;
import javax.swing.*;


public class ProgressBar extends JProgressBar {
    public ProgressIndicator progressIndicator;

    public ProgressBar(ProgressIndicator progressIndicator) {
        this.progressIndicator = progressIndicator;
        this.setStringPainted(true); // show the percentage on the bar
        this.setFont(new Font("MV Boli", Font.BOLD, 10)); // customize the bar
        this.setForeground(Color.red); // set the fill color of the bar
        this.setBackground(Color.WHITE); // set the background color of the bar
    }

    public void setUpdatedCounter(){
        this.setValue(progressIndicator.getCurrentProcentage());     //inserts the percentageOnBar -value in the progressbar class object
    }

    public void setProgressbarBounds(){
        this.setBounds(200,10, 400, 10);        //sets the bounds of the progressbar
    }

    public int getCurrentProgressValue() {
        int currentProgressBarValue = this.getValue();
        System.out.print(currentProgressBarValue);
        return currentProgressBarValue;
    }

    public void updatePrgressBar(){
        progressIndicator.calculatePrecentageIncrease();
        progressIndicator.showIncreaseIfWholeNumber();
    }



}
