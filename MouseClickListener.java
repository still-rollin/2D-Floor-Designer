import java.awt.event.*;

public class MouseClickListener implements MouseListener {

    private CanvasPanel canvasPanel;

    public MouseClickListener(CanvasPanel canvasPanel) {
        this.canvasPanel = canvasPanel;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
    }

    @Override
    public void mousePressed(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}
}
