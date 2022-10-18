package View;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

import Model.*;

import Model.Obstacle;
import Utilities.Constants;

public class PaintingStuff extends JComponent {

    private Player player;
    private DrawPlayer drawPlayer;
    private DrawRectView drawrect;
    private DrawCircView drawCirc;
    private DrawLevel levelOne;
    private DrawProjectile drawProjectile;
    private Projectile projectile;
    private ArrayList<Projectile> projectiles;
    private DrawPowerUp drawPowerUp;
    private ArrayList<Obstacle> obstacles = new ArrayList<>();
    private ArrayList<DrawRectView> drawRectViews = new ArrayList<>();



    public PaintingStuff(Player player, ArrayList<Projectile> projectiles, Obstacle obstacle, LevelOne levelOne, PowerUp powerUp){
        this.player = player;
        this.drawrect = new DrawRectView(obstacle);
        this.drawPlayer = new DrawPlayer(player);
        this.drawCirc = new DrawCircView(obstacle);
        this.levelOne = new DrawLevel(levelOne);
        this.projectiles = projectiles;
        this.drawProjectile = new DrawProjectile(projectile);
        this.drawPowerUp = new DrawPowerUp(powerUp);
        /*
        makeObsticales();
        makedrawrec();
        moveObsticals(drawRectViews);
         */
    }
    DrawGameBackgroundView dbg = new DrawGameBackgroundView(Constants.SCREEN_WIDTH,Constants.SCREEN_HEIGHT);
       // drawLevel.drawLevelOne(g);



    public void drawProjectile(ArrayList<Projectile> projectiles, Graphics g){
        this.projectiles = projectiles;
        super.paintComponent(g);
        if(projectiles.size() != 0){
            for(Projectile projectile : projectiles){
                g.setColor(new Color(85, 85, 85));
                g.fillRect(projectile.getxPosition(), projectile.getyPosition(), 20, 10);
            }
        }
    }



    /*

    public void makeObsticales(){
        for (int i = 0; i < 5; i++ ){
            Obstacle obstacle = new Obstacle(Constants.RECT_WIDTH, Constants.RECT_HEIGHT, Constants.OBSTACLE_SPEED,false, Constants.OBSTACLE_START_X + i * 2, Constants.OBSTACLE_START_Y);
            obstacles.add(obstacle);
        }
    }

    public void makedrawrec(){
        for (int i = 0; i < 5; i++ ){
            DrawRectView drawRectView = new DrawRectView(obstacles.get(i));
            drawRectViews.add(drawRectView);
        }
    }


    public void drawobsticals(ArrayList<DrawRectView> drawRectViews, Graphics g) {
        this.drawRectViews = drawRectViews;
        super.paintComponent(g);
        if (projectiles.size() != 0) {
            for (DrawRectView drawRectView : drawRectViews) {
                g.setColor(new Color(85, 85, 85));
                g.fillRect(drawRectView.obstacle.getxPosition(), Constants.Y_POS, Constants.RECT_WIDTH, Constants.RECT_HEIGHT);
                System.out.println("blabla");
            }
        }
    }

    public void moveObsticals(ArrayList<DrawRectView> drawRectViews){
        this.drawRectViews = drawRectViews;
        for (DrawRectView drawRectView: drawRectViews){
            drawRectView.obstacle.move();
        }

    }*/


    public void paintComponent(Graphics g){
        drawrect.drawRect(g);
        dbg.draw2(g);
        drawCirc.drawCirc(g);
        drawPlayer.drawPlayer(g);
        drawProjectile(projectiles, g);
        drawPowerUp.drawPowerup(g);
        //drawobsticals(drawRectViews, g);

    }
}
