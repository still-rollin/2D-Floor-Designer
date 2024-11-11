import java.awt.*;

public class Door {
    private Point position;
    private int width = 20; 
    private int height = 10; 
    private String orientation; 

    public Door(Point position, String orientation) {
        this.position = position;
        this.orientation = orientation;
        adjustDimensions();
    }

    private void adjustDimensions() {
        if (orientation.equals("N") || orientation.equals("S")) {
            width = 50;
            height = 10;
        } else if (orientation.equals("E") || orientation.equals("W")) {
            width = 10;
            height = 50;
        }
    }

    public boolean intersects(Door other) {
        return position.x < other.position.x + other.width &&
               position.x + width > other.position.x &&
               position.y < other.position.y + other.height &&
               position.y + height > other.position.y;
    }

    public void draw(Graphics g) {
        g.setColor(Color.ORANGE); 
        g.fillRect(position.x, position.y, width, height);
    }

    public Point getPosition() {
        return position;
    }

    public String getOrientation() {
        return orientation;
    }

    public void setPosition(Point position) {
        this.position = position;
    }

    public void setOrientation(String orientation) {
        this.orientation = orientation;
        adjustDimensions();
    }
}
