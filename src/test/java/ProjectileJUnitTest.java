import Model.Projectile;
import Utilities.Constants;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class ProjectileJUnitTest {

    @Test
    public void projectileMovesTest(){
        Projectile projectileTest = new Projectile(1,1,5,true, Constants.PLAYER_START_X, Constants.Y_POS);
        projectileTest.move();
        assertEquals(projectileTest.getxPosition(),Constants.PLAYER_START_X+5);
    }
}
