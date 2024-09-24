import javax.swing.*;
import java.awt.*;

public class ClockFrame {
    private JFrame frame;
    private ClockLabel clockLabel;

    public ClockFrame() {
        setupFrame();
        clockLabel = new ClockLabel();
        frame.add(clockLabel.getLabel(), BorderLayout.CENTER);
        frame.setVisible(true);
    }

    private void setupFrame() {
        frame = new JFrame("Digital Clock");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new BorderLayout());
    }

    public void startClock() {
        clockLabel.updateClock();
    }
}
