import Model.*;
import Model.CollisionDetector;
import Utilities.Constants;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class CollisionDetectorTest {


    @Test
    void playerObstacleNotCollidedTest() {
        PowerUp powerUpTest = new PowerUp(1,1,1,1,1);
        ArrayList<Projectile> projectilesTest = new ArrayList<>();
        projectilesTest.add(new Projectile(1, 1, 1, true, 2,1));
        Player playerCollisionTest = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS + Constants.RECT_HEIGHT + 1, 0, true, powerUpTest);
        ArrayList<Obstacle> obstaclesTest = new ArrayList<>();
        Obstacle obstacleCollisionTest = new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, 0, true, 0, Constants.Y_POS);
        obstaclesTest.add(obstacleCollisionTest);
        CollisionDetector collisionDetector = new Model.CollisionDetector(playerCollisionTest, obstaclesTest, projectilesTest, powerUpTest);
        collisionDetector.runCollisionDetectorSystem();
        assertTrue(playerCollisionTest.getaliveStatus());
    }

    @Test
    void playerObstacleCollidedTest() {
        PowerUp powerUpTest2 = new PowerUp(1,1,1,1,1);
        ArrayList<Projectile> projectilesTest2 = new ArrayList<>();
        projectilesTest2.add(new Projectile(1, 1, 1, true, 2,1));
        ArrayList<Obstacle> obstaclesTest2 = new ArrayList<>();
        Player playerCollisionTest2 = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS - Constants.RECT_HEIGHT, 0, true, powerUpTest2);
        Obstacle obstacleCollisionTest2 = new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, 0, true, 0 + Constants.RECT_WIDTH, Constants.Y_POS);
        obstaclesTest2.add(obstacleCollisionTest2);
        CollisionDetector collisionDetector2 = new Model.CollisionDetector(playerCollisionTest2, obstaclesTest2, projectilesTest2, powerUpTest2);
        collisionDetector2.runCollisionDetectorSystem();
        assertFalse(playerCollisionTest2.getaliveStatus());
    }

    @Test
    void playerCollidesWithPowerUp() {
        PowerUp powerUpTest3 = new PowerUp(1,1,1,0,Constants.Y_POS - Constants.RECT_HEIGHT);
        ArrayList<Projectile> projectilesTest3 = new ArrayList<>();
        ArrayList<Obstacle> obstaclesTest3 = new ArrayList<>();
        Player playerCollisionTest3 = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS - Constants.RECT_HEIGHT, 0, true, powerUpTest3);
        CollisionDetector collisionDetector3 = new Model.CollisionDetector(playerCollisionTest3, obstaclesTest3, projectilesTest3, powerUpTest3);
        collisionDetector3.runCollisionDetectorSystem();
        playerCollisionTest3.runPlayerSystem();
        assertTrue(playerCollisionTest3.getPoweredUpStatus());
    }

    @Test
    void projectileCollidesWithObstacleTest() {
        PowerUp powerUpTest = new PowerUp(1,1,1,1,1);
        ArrayList<Projectile> projectilesTest4 = new ArrayList<>();
        projectilesTest4.add(new Projectile(1, 1, 1, true, 0,250));
        ArrayList<Obstacle> obstaclesTest4 = new ArrayList<>();
        Obstacle obstacleCollisionTest4 = new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, 0, true, 0, Constants.Y_POS);
        obstaclesTest4.add(obstacleCollisionTest4);
        Player playerCollisionTest = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS + Constants.RECT_HEIGHT + 1, 10, true, powerUpTest);
        CollisionDetector collisionDetector4 = new Model.CollisionDetector(playerCollisionTest, obstaclesTest4, projectilesTest4, powerUpTest);
        collisionDetector4.runCollisionDetectorSystem();
        assertEquals(0, projectilesTest4.size());
        assertEquals(0, obstaclesTest4.size());
    }
}