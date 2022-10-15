import Model.CollisionDetector;
import Model.Obstacle;
import Model.Player;
import Utilities.Constants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CollisionDetectorTest {


    @Test
    void playerObstacleNotCollidedTest() {
        Player playerCollisionTest = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS + Constants.RECT_HEIGHT + 1, 0, true);
        Obstacle obstacleCollisionTest = new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, 0, 0, Constants.Y_POS);
        CollisionDetector collisionDetector = new Model.CollisionDetector(playerCollisionTest, obstacleCollisionTest);
        collisionDetector.detectCollision();
        assertTrue(playerCollisionTest.alive);
    }

    @Test
    void playerObstacleCollidedTest() {
        Player playerCollisionTest = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS - Constants.RECT_HEIGHT, 0, true);
        Obstacle obstacleCollisionTest = new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, 0, 0 + Constants.RECT_WIDTH, Constants.Y_POS);
        CollisionDetector collisionDetector = new Model.CollisionDetector(playerCollisionTest, obstacleCollisionTest);
        collisionDetector.detectCollision();
        assertFalse(playerCollisionTest.alive);
    }
}
