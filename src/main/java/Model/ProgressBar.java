package Model;

import Utilities.Constants;
//
public class ProgressBar {
    public double currentIncrease = 0;               //currentIncrease is initialized to 0
    public int percentageOnBar = 0;                  //the percentage on the progressbar is initialized to 0%
    int fullProgressBar = 100;


    public double getIncreasedTime(double ms_perLevel) {
        double inc_EveryThreadIteration = Constants.Thread_argument_ms * fullProgressBar / ms_perLevel;  //decides the procentage increase "inc_EveryThreadIteration" every 10 millieseconds by multiplying 10 ms with 100 % and divding it with the amount of millie seconds that a level takes to clear ->
        return inc_EveryThreadIteration;                                                                  //-> the current level pre-decided length
    }


    public void updateTime() {
        while (currentIncrease % 1 != 0.0 || currentIncrease == 0.0) {                      //"if currentIncrease is not a whole number or if currentIncrease equals 0: enter the while loop"
            currentIncrease = (currentIncrease + getIncreasedTime(Constants.SEC_LV1));      //updates the currentIncrease value by a specific value depending on the pre-decided ->
            //-> length of level 1 (this value is calculated in getIncreasedTime)
            currentIncrease = Math.round(currentIncrease * 1000000000d) / 1000000000d;      //rounds the number to a double with only 2 decimal places
            //System.out.println(x);
            break;                                              //break the loop to move on to "increaseIfWholeNumber"
        }
    }

    public void increaseIfWholeNumber() {
        if (currentIncrease % 1 == 0.0) {
            //if currentIncrease is a whole number with no decimals(in this case currentIncrease will only ever equal 1.0): increase the progressbar percentage by 1
            percentageOnBar += 1;
            currentIncrease = 0;                  //reset currentIncrease to 0 so that the while-loop above will continue to be entered during the coming game-loop iterations
        }
    }



}


