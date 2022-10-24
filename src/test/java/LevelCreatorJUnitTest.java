import Model.LevelCreator;
import Model.Obstacle;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class LevelCreatorJUnitTest {
    @Test
    public void checkObstacleExistence(){
        LevelCreator testLevelCreator = new LevelCreator(new ArrayList<Obstacle>());
        testLevelCreator.createLevel();
        assertEquals(12, testLevelCreator.getObstacleList().size()); //kollar så antalet objekt stämmer överens med antalet objekt i Model
    }
}
