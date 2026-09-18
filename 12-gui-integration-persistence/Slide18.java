import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Slide18 {
    record StudySession(String topic, int minutes) {
        StudySession {
            if (topic == null || topic.isBlank()) throw new IllegalArgumentException("Topic must not be blank");
            if (topic.chars().anyMatch(c -> c == '\t' || c == '\n' || c == '\r')) throw new IllegalArgumentException("Topic must not contain tabs or line breaks");
            if (minutes < 1) throw new IllegalArgumentException("Minutes must be positive");
            topic = topic.strip();
        }
    }
    static final class StudyPlan {
        private final List<StudySession> sessions = new ArrayList<>();
        void add(String topic, int minutes) { sessions.add(new StudySession(topic, minutes)); }
        List<StudySession> sessions() { return List.copyOf(sessions); }
        long totalMinutes() { long t = 0; for (StudySession s : sessions) t += s.minutes(); return t; }
    }
    static class PlanFormatException extends Exception { PlanFormatException(String m) { super(m); } }
    static final class PlanStorage {
        static void save(StudyPlan plan, Path file) throws IOException {
            List<String> lines = new ArrayList<>();
            for (StudySession s : plan.sessions()) lines.add(s.minutes() + "\t" + s.topic());
            Files.write(file, lines, StandardCharsets.UTF_8);
        }
        static StudyPlan load(Path file) throws IOException, PlanFormatException {
            List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
            StudyPlan plan = new StudyPlan();
            for (int i = 0; i < lines.size(); i++) {
                String line = lines.get(i);
                if (line.isBlank()) continue;
                int tab = line.indexOf('\t');
                if (tab < 0) throw new PlanFormatException("line " + (i + 1) + ": expected minutes<TAB>topic");
                int minutes;
                try { minutes = Integer.parseInt(line.substring(0, tab).strip()); }
                catch (NumberFormatException e) { throw new PlanFormatException("line " + (i + 1) + ": minutes must be a whole number"); }
                try { plan.add(line.substring(tab + 1), minutes); }
                catch (IllegalArgumentException e) { throw new PlanFormatException("line " + (i + 1) + ": " + e.getMessage()); }
            }
            return plan;
        }
    }
    private static final Path FILE = Path.of("plan.tsv");
    @FXML private ListView<String> sessionList;
    @FXML private Label feedbackLabel;
    private StudyPlan plan = new StudyPlan();

    @FXML private void onSave() {
        try {
            PlanStorage.save(plan, FILE);
            feedbackLabel.setText("Saved " + plan.sessions().size() + " sessions to " + FILE);
        } catch (IOException e) {
            feedbackLabel.setText("Could not save: " + e.getMessage());
        }
    }

    @FXML private void onLoad() {
        try {
            StudyPlan loaded = PlanStorage.load(FILE);
            plan = loaded;
            refresh();
            feedbackLabel.setText("Loaded " + plan.sessions().size() + " sessions.");
        } catch (PlanFormatException | IOException e) {
            feedbackLabel.setText("Could not load; keeping current sessions. " + e.getMessage());
        }
    }

    private void refresh() {
        sessionList.getItems().setAll(plan.sessions().stream().map(s -> s.minutes() + " min — " + s.topic()).toList());
    }
}
