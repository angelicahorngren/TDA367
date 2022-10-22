import Model.*;
import Utilities.Constants;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class PowerUpJUnitTest {

    @Test
    public void PowerUpSystemRunnable(){
        PowerUp powerUpTest = new PowerUp(1,1,5, Constants.PLAYER_START_X, Constants.Y_POS);
        ArrayList<Projectile> projectilesTest = new ArrayList<>();
        ArrayList<Obstacle> obstaclesTest = new ArrayList<>();
        Player playerCollisionTest = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS - Constants.RECT_HEIGHT, Constants.PLAYER_START_X, true, powerUpTest);
        CollisionDetector collisionDetector = new Model.CollisionDetector(playerCollisionTest, obstaclesTest, projectilesTest, powerUpTest);
        collisionDetector.runCollisionDetectorSystem();
        powerUpTest.runpowerUpSystem();
        assertTrue(powerUpTest.getPowerUpStatus());
        assertEquals(Constants.PLAYER_START_X+5, powerUpTest.getxPosition());
        powerUpTest.setPowerUpTimer(3000);
        powerUpTest.runpowerUpSystem();
        assertFalse(powerUpTest.getPowerUpStatus());
    }

    @Test
    public void powerUpOutOfBounds(){
        PowerUp powerUpTest = new PowerUp(1,1,5, 3006, Constants.Y_POS);
        powerUpTest.move();
        assertEquals(-1, powerUpTest.getxPosition());
    }
}
