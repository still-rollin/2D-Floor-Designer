import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class CanvasPanel extends JPanel {
    private ArrayList<Room> rooms = new ArrayList<>();

    public CanvasPanel() {
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
            }
        });
        addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent e) {
            }
        });
    }

    public void addRoom(Room room) {
        if (!isOverlapping(room)) {
            rooms.add(room);
            repaint();
        } else {
            JOptionPane.showMessageDialog(this, "Overlap detected! Room cannot be added.");
        }
    }

    private boolean isOverlapping(Room newRoom) {
        for (Room room : rooms) {
            if (room.intersects(newRoom)) return true;
        }
        return false;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        for (Room room : rooms) {
            room.draw(g);
        }
    }
}
