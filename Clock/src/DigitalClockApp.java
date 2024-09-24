import javax.swing.SwingUtilities;

public class DigitalClockApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ClockFrame clockFrame = new ClockFrame();
            clockFrame.startClock();
        });
    }
}
