import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

public class Slide25 extends Application {
    record StudySession(String topic, int minutes) { }
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
    private final Label totalLabel = new Label("Total: 0 minutes");

    void refresh() {
        sessionList.getItems().setAll(plan.sessions().stream().map(s -> s.minutes() + " min — " + s.topic()).toList());
        totalLabel.setText("Total: " + plan.totalMinutes() + " minutes");
    }

    void addFromForm() {
        int minutes = Integer.parseInt(minutesField.getText().strip());
        plan.add(topicField.getText(), minutes);
        refresh();
    }

    @Override public void start(Stage stage) {
        topicField.setText("Maps"); minutesField.setText("30");
        addFromForm();
        VBox root = new VBox(12, topicField, minutesField, sessionList, totalLabel);
        root.setPadding(new Insets(16));
        stage.setScene(new Scene(root, 420, 360));
        stage.show();
    }
    public static void main(String[] args) { launch(args); }
}
