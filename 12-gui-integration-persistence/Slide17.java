import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Slide17 {
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
    public static void main(String[] args) throws Exception {
        Path good = Path.of("good.tsv");
        Files.writeString(good, "30\tMaps\n45\tGenerics\n");
        System.out.println(PlanStorage.load(good).totalMinutes());
        Path bad = Path.of("bad.tsv");
        Files.writeString(bad, "30\tMaps\n\nabc\tSets\n");
        try { PlanStorage.load(bad); } catch (PlanFormatException e) { System.out.println(e.getMessage()); }
        try { PlanStorage.load(Path.of("missing.tsv")); } catch (IOException e) { System.out.println("missing: " + e.getMessage()); }
    }
}
