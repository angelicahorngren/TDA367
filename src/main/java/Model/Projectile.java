package Model;



public class Projectile extends Obstacle{


    public Projectile(int width, int height, int speed, boolean isDestroyable, int startXpos, int yPosition) {
        super(width, height, speed, isDestroyable, startXpos, yPosition);
        this.width = width; //nödvändigt? hämtar från super.
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
