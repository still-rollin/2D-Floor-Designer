import java.awt.*;

public class Door {
    private Point position;
    private int width = 20;  // Width of the door
    private int height = 10;  // Height of the door
    private String orientation;  // "N", "S", "E", "W" to represent the wall side

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
        g.setColor(Color.ORANGE);  // Door color
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
