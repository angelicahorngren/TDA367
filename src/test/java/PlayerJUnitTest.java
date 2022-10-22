import Model.Player;
import Model.PowerUp;
import Utilities.Constants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PlayerJUnitTest {

    @Test
    void playerJumpTest() {
        PowerUp powerUpTest = new PowerUp(1,1,1,1,1);
        Player playerJumpTest = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, 250, true, powerUpTest);
        playerJumpTest.jump();
        assertEquals(250 - 10, playerJumpTest.getyPosition());
    }


    @Test
    void playerGravityTest() {
        PowerUp powerUpTest = new PowerUp(1,1,1,1,1);
        Player playerGravityTest = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, 250, true, powerUpTest);
        playerGravityTest.runPlayerSystem();
        playerGravityTest.jump();
        playerGravityTest.gravity();
        playerGravityTest.gravity();
        assertEquals(Constants.Y_POS - 10 + 1, playerGravityTest.getyPosition());
    }


    @Test
    void playerJumpAndFallTest() {
        PowerUp powerUpTest = new PowerUp(1,1,1,1,1);
        Player playerJumpAndFalling = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, 250, true, powerUpTest);
        playerJumpAndFalling.jump();
        playerJumpAndFalling.gravity();
        playerJumpAndFalling.gravity();
        System.out.println(playerJumpAndFalling.getyPosition());
        assertEquals(Constants.Y_POS - 10 + 1, playerJumpAndFalling.getyPosition());
    }

    @Test
    void moveIntoFrameTest() {
        PowerUp powerUpTest = new PowerUp(1,1,1,1,1);
        Player playerMovingIntoFrame = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, 0, true, powerUpTest);
        while(playerMovingIntoFrame.getxPosition() < 250){
            playerMovingIntoFrame.moveIntoFrame();
        }
        System.out.println(playerMovingIntoFrame.getxPosition());
        assertEquals(252, playerMovingIntoFrame.getxPosition());
    }




}