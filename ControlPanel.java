import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ControlPanel extends JPanel {
    private CanvasPanel canvas;

    public ControlPanel(CanvasPanel canvas) {
        this.canvas = canvas;
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));

        JButton addRoomButton = new JButton("Add Room");
        JButton savePlanButton = new JButton("Save Plan");
        JButton loadPlanButton = new JButton("Load Plan");

        addRoomButton.addActionListener(e -> addRoom());
        savePlanButton.addActionListener(e -> savePlan());
        loadPlanButton.addActionListener(e -> loadPlan());

        add(addRoomButton);
        add(savePlanButton);
        add(loadPlanButton);
    }

    private void addRoom() {
        Room newRoom = new Room(new Point(50, 50), "Bedroom");
        canvas.addRoom(newRoom);
    }

    private void savePlan() {
    }

    private void loadPlan() {
    }
}
