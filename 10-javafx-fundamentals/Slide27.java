import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Slide27 extends Application {
    record StudySession(String topic, int minutes) {
        StudySession { if (topic == null || topic.isBlank()) throw new IllegalArgumentException("Topic must not be blank"); if (minutes < 1) throw new IllegalArgumentException("Minutes must be positive"); }
    }
    static final class StudyPlan {
        private final List<StudySession> sessions = new ArrayList<>();
        void add(String topic, int minutes) { sessions.add(new StudySession(topic, minutes)); }
        List<StudySession> sessions() { return List.copyOf(sessions); }
        long totalMinutes() { long t = 0; for (StudySession s : sessions) t += s.minutes(); return t; }
    }
    private final StudyPlan plan = new StudyPlan();
    private final TextField topicField = new TextField();
    private final TextField minutesField = new TextField();
    private final ListView<String> sessionList = new ListView<>();
    private final Label feedback = new Label();

    void refresh() {
        sessionList.getItems().setAll(plan.sessions().stream().map(s -> s.minutes() + " min — " + s.topic()).toList());
    }

    void addFromForm() {
        int minutes;
        try {
            minutes = Integer.parseInt(minutesField.getText().strip());
        } catch (NumberFormatException e) {
            feedback.setText("Minutes must be a whole number.");
            return;
        }
        try {
            plan.add(topicField.getText(), minutes);
        } catch (IllegalArgumentException e) {
            feedback.setText(e.getMessage());
            return;
        }
        refresh();
        feedback.setText("Session added.");
    }

    @Override public void start(Stage stage) {
        VBox root = new VBox(12, topicField, minutesField, sessionList, feedback);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 420, 360));
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
