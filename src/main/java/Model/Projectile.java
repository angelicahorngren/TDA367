package Model;


public class Projectile extends Obstacle implements IMovable{



    public Projectile(int width, int height, int speed, boolean isDestroyable, int startXpos, int yPosition) {
        super(width, height, speed, isDestroyable, startXpos, yPosition);
        this.width = width;
        this.height = height;
        this.isDestroyable = true;
        this.speed = speed;
        this.xPosition = startXpos;
        this.yPosition = yPosition;
    }

    @Override
    public void move() {
        xPosition += speed;
    }

}
