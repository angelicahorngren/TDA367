/*import Model.Player;
import Utilities.Constants;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerTest {

    @Test
    void playerJumpTest() {
        Player playerJumpTest = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, 250, true);
        playerJumpTest.jump();
        assertEquals(250 - 10, playerJumpTest.getyPosition());
    }


    @Test
    void playerGravityTest() {
        Player playerGravityTest = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS - 10, 250, true);
        playerGravityTest.gravity();
        playerGravityTest.gravity();
        System.out.println(playerGravityTest.getyPosition());
        assertEquals(Constants.Y_POS - 10 + 1, playerGravityTest.getyPosition());
    }


    @Test
    void playerJumpAndFallTest() {
        Player playerJumpAndFalling = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, 250, true);
        playerJumpAndFalling.jump();
        playerJumpAndFalling.gravity();
        playerJumpAndFalling.gravity();
        System.out.println(playerJumpAndFalling.getyPosition());
        assertEquals(Constants.Y_POS - 10 + 1, playerJumpAndFalling.getyPosition());
    }

    @Test
    void moveIntoFrameTest() {
        Player playerMovingIntoFrame = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, 0, true);
        while(playerMovingIntoFrame.xPosition < 250){
            playerMovingIntoFrame.moveIntoFrame();
        }
        System.out.println(playerMovingIntoFrame.getxPosition());
        assertEquals(252, playerMovingIntoFrame.getxPosition());
    }




}

 */

