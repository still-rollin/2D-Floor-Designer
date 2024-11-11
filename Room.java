import java.awt.*;
import java.awt.Point;

public class Room {
    private Point position;
    private int width = 100;
    private int height = 100;
    private String type;

    public Room(Point position, String type) {
        this.position = position;
        this.type = type;
    }

    public boolean intersects(Room other) {
        return position.x < other.position.x + other.width &&
               position.x + width > other.position.x &&
               position.y < other.position.y + other.height &&
               position.y + height > other.position.y;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillRect(position.x, position.y, width, height);
    }
}
