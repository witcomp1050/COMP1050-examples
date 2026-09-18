import java.nio.file.Files;
import java.nio.file.Path;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

class Slide33 {
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
    @Test void roundTrip(@TempDir Path dir) throws Exception {
        StudyPlan plan = new StudyPlan();
        plan.add("Generics", 45);
        plan.add("Sets and maps", 30);
        Path file = dir.resolve("plan.tsv");
        PlanStorage.save(plan, file);
        StudyPlan loaded = PlanStorage.load(file);
        assertEquals(75L, loaded.totalMinutes());
    }

    @Test void malformedFileIsRejected(@TempDir Path dir) throws Exception {
        Path file = dir.resolve("bad.tsv");
        Files.writeString(file, "45\tGenerics\nnot-a-number\tMaps\n");
        PlanFormatException ex = assertThrows(PlanFormatException.class, () -> PlanStorage.load(file));
        assertTrue(ex.getMessage().contains("line 2"));
    }
}
