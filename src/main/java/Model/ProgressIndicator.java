//FLYTTA DENNA KLASSEN TILL VIEW DÅ PROGRESSBAR I VIEW CALLAR PÅ EN FUNKTION HÄRIFRÅN

package Model;

import Utilities.Constants;

import static main.GameLoop.Thread_argument_ms;

public class ProgressIndicator {
    private double percentageIncrease = 0;               //currentIncrease is initialized to 0
    private int visibleCurrentPercentage = 0;                  //the percentage on the progressbar is initialized to 0%
    private int  fullPercentage = 100;
    //public static int Thread_argument_ms = 10;

    public double percantageInc_EveryThreadIteration(double ms_perLevel) {
        double percantageInc_EveryThreadIteration = Thread_argument_ms * fullPercentage / ms_perLevel;  //calculate the procentage increase every 10 millieseconds by multiplying 10 ms with 100 % and divding it with the amount of millie seconds that a level takes to clear ->
        return percantageInc_EveryThreadIteration;                                                                  //-> the current level pre-decided length
    }


    public void calculatePercentageIncrease() {
        while (percentageIncrease % 1 != 0.0 || percentageIncrease == 0.0) {                      //"if currentIncrease is not a whole number or if currentIncrease equals 0: enter the while loop"
            percentageIncrease = (percentageIncrease + percantageInc_EveryThreadIteration(Constants.SEC_LV1));      //updates the currentIncrease value by a specific value depending on the pre-decided length of level 1 (this value is calculated in getIncreasedTime)
            percentageIncrease = Math.round(percentageIncrease * 1000000000d) / 1000000000d;      //rounds the number to a double with only 2 decimal places
            break;
        }
    }


    public void showIncreaseIfWholeNumber() {
        if (percentageIncrease % 1 == 0.0) {
            //if currentIncrease is a whole number with no decimals(in this case currentIncrease will only ever equal 1.0): increase the progressbar percentage by 1
            visibleCurrentPercentage += 1;
            percentageIncrease = 0;                  //reset currentIncrease to 0 so that the while-loop above will continue to be entered during the coming game-loop iterations
        }
    }

    public int getCurrentPercentage(){
        return visibleCurrentPercentage;
    }

    public void resetProgressIndicator(){
        visibleCurrentPercentage = 0;
    }

}



