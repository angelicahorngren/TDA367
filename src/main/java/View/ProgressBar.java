package View;

import java.awt.*;
import javax.swing.*;


public class ProgressBar extends JProgressBar {
    public ProgressIndicator progressIndicator;

    /**
     * A constructor of ProgressBar
     * @param progressIndicator
     */
    public ProgressBar(ProgressIndicator progressIndicator) {
        this.progressIndicator = progressIndicator;
        this.setStringPainted(true); // show the percentage on the bar
        this.setFont(new Font("MV Boli", Font.BOLD, 10)); // customize the bar
        this.setForeground(Color.red); // set the fill color of the bar
        this.setBackground(Color.WHITE); // set the background color of the bar
    }

    /**
     * this method is used to update the progress bar counter that is shown on the screen
     */
    public void setUpdatedCounter(){
        this.setValue(progressIndicator.getCurrentPercentage());     //inserts the percentageOnBar -value in the progressbar class object
    }

    /**
     * this method is used to decides the positions and dimentions of the progress bar
     */

    public void setProgressbarBounds(){
        this.setBounds(200,10, 400, 10);        //sets the bounds of the progressbar
    }

    /**
     *
     * @return this method is used to return the current value of the progressbar
     */
    public int getCurrentProgressValue() {
        int currentProgressBarValue = this.getValue();
        return currentProgressBarValue;
    }

    /**
     * This method calls the two methods that are neccasary to create the progressbar
     */
    public void createProgressBar(){
        setUpdatedCounter();
        setProgressbarBounds();
    }
    /**
     * This method is used to update the progressbar depending on the thread iteration of the game
     */
    public void updatePrgressBar(){
        progressIndicator.calculatePercentageIncrease();
        progressIndicator.showIncreaseIfWholeNumber();
    }

    /**
     * This method is runs all the method that are required to create and update the progress bar.
     * this is the only method that is required in the game loop for the progress bar to work
     */

    public void runProgressBarSystem(){
        createProgressBar();
        updatePrgressBar();

    }



}
