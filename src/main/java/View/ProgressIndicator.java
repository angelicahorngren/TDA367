package View;

import Utilities.Constants;

import static main.GameLoop.Thread_argument_ms;

public class ProgressIndicator {
    private double percentageIncrease = 0;
    private int visibleCurrentPercentage = 0;
    private int  fullPercentage = 100;


    /**
     * The method calculate the percentage icrease every 10 ml seconds
     * @param ms_perLevel used to get the time that a level takes to complete
     * @return the persantage that is going to be added to the progressbar every thread iteration
     */
    public double percantageInc_EveryThreadIteration(double ms_perLevel) {
        double percantageInc_EveryThreadIteration = Thread_argument_ms * fullPercentage / ms_perLevel;
        return percantageInc_EveryThreadIteration;
    }

    /**
     * The method calculate the percentage increase until the increase is a 1
     * The increase is rounded to a whole number so that it is add to the progressbar
     */

    public void calculatePercentageIncrease() {
        while (percentageIncrease % 1 != 0.0 || percentageIncrease == 0.0) {
            percentageIncrease = (percentageIncrease + percantageInc_EveryThreadIteration(Constants.SEC_LV1));
            percentageIncrease = Math.round(percentageIncrease * 1000000000d) / 1000000000d;
            break;
        }
    }


    /**
     * The method increase the visible percentage increase that is showen in the progressbar when the percentage Increase become 1
     * percentageIncrease is set back to zero so the calculatePercentageIncrease can run again
     */
    public void showIncreaseIfWholeNumber() {
        if (percentageIncrease % 1 == 0.0) {
            visibleCurrentPercentage += 1;
            percentageIncrease = 0;
        }
    }

    /**
     *
     * @return the visible Percentage
     */
    public int getCurrentPercentage(){
        return visibleCurrentPercentage;
    }

    /**
     * This method set the visible Percentage to zero so the game can restar with an empty progressbar
     */

    public void resetProgressIndicator(){
        visibleCurrentPercentage = 0;
    }

}



