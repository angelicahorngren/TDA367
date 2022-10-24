import Model.Obstacle;
import Utilities.Constants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ObstacleJUnitTest {
    @Test
    public void obstacleHasSpecifiedValues(){
        Obstacle testObstacle1 = new Obstacle(1,2,3,true,10,20);
        assertEquals(1, testObstacle1.getWidth());
        assertEquals(2, testObstacle1.getHeight());
        assertEquals(3, testObstacle1.getSpeed());
        assertTrue(testObstacle1.getIsDestroyable());
        assertEquals(10, testObstacle1.getxPosition());
        assertEquals(20, testObstacle1.getyPosition());
    }

    @Test
    public void obstacleMoves(){
        Obstacle testObstacle2 = new Obstacle(1,1,5,true,0,20);
        int xPositionBefore = testObstacle2.getxPosition();
        testObstacle2.move();
        assertFalse(xPositionBefore == testObstacle2.getxPosition());
    }

    @Test
    public void obstacleCanReset(){
        Obstacle testObstacle3 = new Obstacle(1,1,5,true, Constants.OBSTACLE_START_X,Constants.OBSTACLE_START_Y);
        int xPositionBefore = testObstacle3.getxPosition();
        testObstacle3.move();
        assertFalse(xPositionBefore == testObstacle3.getxPosition());
        testObstacle3.resetObstacle();
        assertEquals(xPositionBefore,testObstacle3.getxPosition());



    }
}
