import javax.swing.*;
import java.awt.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class ClockLabel {
    private JLabel timeLabel;
    private SimpleDateFormat timeFormat;

    public ClockLabel() {
        setupLabel();
        timeFormat = new SimpleDateFormat("HH:mm:ss");
    }

    private void setupLabel() {
        timeLabel = new JLabel();
        timeLabel.setHorizontalAlignment(SwingConstants.CENTER);
        timeLabel.setFont(new Font("Arial", Font.BOLD, 40));
    }

    public JLabel getLabel() {
        return timeLabel;
    }

    public void updateClock() {
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Calendar calendar = Calendar.getInstance();
                String time = timeFormat.format(calendar.getTime());
                SwingUtilities.invokeLater(() -> timeLabel.setText(time));
            }
        }, 0, 1000);
    }
}
