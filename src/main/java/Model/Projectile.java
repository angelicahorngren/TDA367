package Model;


public class Projectile extends Obstacle implements IMovable{


    /**
     * Constructor for Projectile.
     * @param width the width of the projectile.
     * @param height the height of the projectile.
     * @param speed the speed of the projectile.
     * @param isDestroyable sets the projectile to destroyable or not destroyable (true or false).
     * @param startXpos the starting x-axis position of the projectile.
     * @param yPosition the y-axis position of the projectile.
     */
    public Projectile(int width, int height, int speed, boolean isDestroyable, int startXpos, int yPosition) {
        super(width, height, speed, isDestroyable, startXpos, yPosition);
        this.width = width;
        this.height = height;
        this.isDestroyable = true;
        this.speed = speed;
        this.xPosition = startXpos;
        this.yPosition = yPosition;
    }

    /**
     *The projectile's move method specifies how it will move across the screen.
     */
    public void move() {
        xPosition += speed;
    }

}
