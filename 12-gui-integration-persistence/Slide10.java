import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Slide10 {
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
    public static void main(String[] args) {
        StudyPlan plan = new StudyPlan();
        plan.add("Maps", 30);
        try { plan.add("Sets", 0); } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
        System.out.println(plan.sessions().size() + " session(s), " + plan.totalMinutes() + " min");
    }
}
