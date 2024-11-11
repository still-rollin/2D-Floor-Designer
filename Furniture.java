import java.awt.*;

public class Furniture {
    private Point position;
    private int size = 30;
    private int rotation = 0;

    public Furniture(Point position) {
        this.position = position;
    }

    public void rotate() {
        rotation = (rotation + 90) % 360;
    }

    public boolean intersects(Furniture other) {
        return position.x < other.position.x + size &&
               position.x + size > other.position.x &&
               position.y < other.position.y + size &&
               position.y + size > other.position.y;
    }

    public void draw(Graphics g) {
        g.setColor(Color.RED);
        g.fillRect(position.x, position.y, size, size);
    }
}
