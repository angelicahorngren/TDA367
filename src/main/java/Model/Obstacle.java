package Model;

public class Obstacle implements IMovable{
    protected int width;
    protected int height;
    protected int speed;
    protected int xPosition;
    protected int startXPosition;
    protected int yPosition;
    protected int startYPosition;
    protected boolean isDestroyable;

    /**
     * The constructor for Obstacle.
     * @param width the width of the obstacle.
     * @param height the height of the obstacle.
     * @param speed the speed of the obstacle.
     * @param isDestroyable decides if obstacle is destroyable or not.
     * @param startXpos the start position of the obstacle on the x-axis.
     * @param yPosition the start position of the obstacle on the y-axis.
     */

    public Obstacle(int width, int height, int speed, boolean isDestroyable, int startXpos, int yPosition){
        this.width = width;
        this.height = height;
        this.speed = speed;
        this.xPosition = startXpos;
        this.startXPosition = startXpos;
        this.yPosition = yPosition;
        this.startYPosition = yPosition;
        this.isDestroyable = isDestroyable;

    }

    /**
     * The obstacle's move method specifies how it will move across the screen. This is called in the gameloop.
     */
    public void move() {
        xPosition += speed;
    }

    public void resetObstacle(){
        xPosition = startXPosition;
        yPosition = startYPosition;
    }


    /**
     * Gets the speed of the obstacle.
     * @return speed of obstacle.
     */
    public int getSpeed(){
        return speed;
    }

    /**
     * Gets the width of the obstacle.
     * @return the width of the obstacle.
     */
    public int getWidth() {
        return width;
    }

    /**
     * Gets the height of the obstacle.
     * @return the height of the obstacle.
     */
    public int getHeight() {
        return height;
    }

    /**
     * Gets the x-axis position of the obstacle.
     * @return the x-axis value of the obstacle.
     */
    public int getxPosition() {
        return xPosition;
    }

    /**
     * Gets the y-axis position of the obstacle.
     * @return the y-axis value of the obstacle.
     */
    public int getyPosition() {
        return yPosition;
    }

    /**
     * Gets if the obstacle is destroyable or not.
     * @return the destroyable  or not information (true or false).
     */
    public boolean getIsDestroyable(){
        return isDestroyable;
    }





}
