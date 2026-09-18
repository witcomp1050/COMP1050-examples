import java.util.ArrayList;
import java.util.List;

public class Slide24 {
    record StudySession(String topic, int minutes) {
        StudySession {
            if (topic == null || topic.isBlank()) throw new IllegalArgumentException("Topic must not be blank");
            if (minutes < 1) throw new IllegalArgumentException("Minutes must be positive");
        }
    }
    static final class StudyPlan {
        private final List<StudySession> sessions = new ArrayList<>();
        public void add(String topic, int minutes) { sessions.add(new StudySession(topic, minutes)); }
        public List<StudySession> sessions() { return List.copyOf(sessions); }
        public long totalMinutes() { long total = 0; for (StudySession s : sessions) total += s.minutes(); return total; }
    }
    public static void main(String[] args) {
        StudyPlan plan = new StudyPlan();
        plan.add("Maps", 30);
        System.out.println(plan.totalMinutes());
        try { plan.add("", 5); } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
        System.out.println(plan.sessions().size());
    }
}
