package MenuView;

import Model.Score;
import View.IDraw;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class DrawGameOverMenu extends JComponent {

    private ArrayList<IDraw> gameOverMenuItems = new ArrayList<>();


    public DrawGameOverMenu(Score score){

        gameOverMenuItems.add(new DrawText("Oops, You lost", 50, 230, 100));
        gameOverMenuItems.add(new DrawText("score this round: ", 20, 300, 150));
        gameOverMenuItems.add(new DrawScore(score, false, 20, 485, 150));


    }

    @Override
    protected void paintComponent(Graphics g) {

        for (IDraw gameOverMenuItems: gameOverMenuItems){

            gameOverMenuItems.draw(g);
        }

    }

}
