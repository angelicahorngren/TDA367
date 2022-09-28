package view;

import java.awt.*;
import javax.swing.*;


public class ProgressBar extends JProgressBar {



    public ProgressBar ()  {

        this.setValue(0);
        this.setBounds(200, 2, 420, 20);

        this.setStringPainted(true); // show the percentage on the bar
        this.setFont(new Font("MV Boli", Font.BOLD, 10)); // customize the bar
        this.setForeground(Color.red); // set the fill color of the bar
        this.setBackground(Color.red); // set the background color of the bar
        UIManager.put("ProgressBar.selectionBackground",Color.red);



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





}