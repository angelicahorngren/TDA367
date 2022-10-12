import Model.PlayerModel;

import java.awt.*;

public class test1 {

    //@Test
    void playerJumpTest() {
        PlayerModel playerModelJumpTest = new PlayerModel();
        PlayerModel.jump();
        System.out.println(playerModelJumpTest.getYPosition());
       //assertEquals(0, playerModelJumpTest.getYPosition());
    }
}
