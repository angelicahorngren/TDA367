package Model;

public class Projectile extends Obstacle{


    public Projectile(int width, int height, int speed, int startXpos, int yPosition) {
        super(width, height, speed, startXpos, yPosition);
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.xPosition = startXpos;
        this.yPosition = yPosition;
    }

}
