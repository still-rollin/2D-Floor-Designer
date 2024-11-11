import java.awt.*;

public class Window {
    private Point position;
    private int width = 30; 
    private int height = 10; 
    private String orientation; 

    public Window(Point position, String orientation) {
        this.position = position;
        this.orientation = orientation;
        adjustDimensions();
    }

    private void adjustDimensions() {
        if (orientation.equals("N") || orientation.equals("S")) {
            width = 40;
            height = 10;
        } else if (orientation.equals("E") || orientation.equals("W")) {
            width = 10;
            height = 40;
        }
    }

    public boolean intersects(Window other) {
        return position.x < other.position.x + other.width &&
               position.x + width > other.position.x &&
               position.y < other.position.y + other.height &&
               position.y + height > other.position.y;
    }

    public void draw(Graphics g) {
        g.setColor(Color.BLUE);  // Window color
        Graphics2D g2d = (Graphics2D) g;
        g2d.setStroke(new BasicStroke(2, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{5}, 0));
        g2d.drawRect(position.x, position.y, width, height);
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

