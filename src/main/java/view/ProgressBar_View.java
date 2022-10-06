package view;

import Model.ProgressBar;
import java.awt.*;
import javax.swing.*;

//hh
public class ProgressBar_View extends JProgressBar {
    public ProgressBar progressBar_;

    public ProgressBar_View() {
        this.progressBar_ = new ProgressBar();
        this.setStringPainted(true); // show the percentage on the bar
        this.setFont(new Font("MV Boli", Font.BOLD, 10)); // customize the bar
        this.setForeground(Color.red); // set the fill color of the bar
        this.setBackground(Color.WHITE); // set the background color of the bar
    }

    public void setUpdatedCounter(){
        this.setValue(progressBar_.percentageOnBar);     //inserts the percentageOnBar -value in the progressbar class object
    }

    public void setProgressbarBounds(){
        this.setBounds(200,10, 400, 10);        //sets the bounds of the progressbar
    }

}
