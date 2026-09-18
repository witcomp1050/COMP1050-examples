import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import java.util.ArrayList;
import java.util.List;

public class Slide32 {
    record StudySession(String topic, int minutes) {
        StudySession { if (topic == null || topic.isBlank()) throw new IllegalArgumentException("Topic must not be blank"); if (minutes < 1) throw new IllegalArgumentException("Minutes must be positive"); }
    }
    static final class StudyPlan {
        private final List<StudySession> sessions = new ArrayList<>();
        void add(String topic, int minutes) { sessions.add(new StudySession(topic, minutes)); }
        List<StudySession> sessions() { return List.copyOf(sessions); }
        long totalMinutes() { long t = 0; for (StudySession s : sessions) t += s.minutes(); return t; }
    }
    @FXML private TextField topicField;
    @FXML private TextField minutesField;
    @FXML private ListView<String> sessionList;
    @FXML private Label totalLabel;
    @FXML private Label feedbackLabel;
    private final StudyPlan plan = new StudyPlan();

    @FXML private void onAdd() {
        int minutes;
        try {
            minutes = Integer.parseInt(minutesField.getText().strip());
        } catch (NumberFormatException e) {
            feedbackLabel.setText("Enter a positive whole number of minutes.");
            return;
        }
        try {
            plan.add(topicField.getText(), minutes);
        } catch (IllegalArgumentException e) {
            feedbackLabel.setText(e.getMessage());
            return;
        }
        refresh();
        topicField.clear(); minutesField.clear(); topicField.requestFocus();
        feedbackLabel.setText("Session added.");
    }

    private void refresh() {
        sessionList.getItems().setAll(plan.sessions().stream().map(s -> s.minutes() + " min — " + s.topic()).toList());
        totalLabel.setText("Total: " + plan.totalMinutes() + " minutes");
    }
}
