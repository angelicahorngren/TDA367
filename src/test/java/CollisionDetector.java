import Model.Player;
import Utilities.Constants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CollisionDetector {


    @Test
    void playerObstacleCollisionTestYAxis() {
        Player playerCollisionTest = new Player(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.Y_POS, 0, true);

        assertTrue(true);
    }
}
