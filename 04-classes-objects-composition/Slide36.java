import java.util.ArrayList;
import java.util.List;

public class Slide36 {
    public static void main(String[] args) {
        StudyPlan plan = new StudyPlan();
        plan.add("Generics", 45);
        plan.add("Maps", 30);
        System.out.println(plan.totalMinutes());
    }
}

record StudySession(String topic, int minutes) { }

final class StudyPlan {
    private final List<StudySession> sessions = new ArrayList<>();
    void add(String topic, int minutes) {
        sessions.add(new StudySession(topic, minutes));
    }
    long totalMinutes() {
        long total = 0;
        for (StudySession s : sessions) total += s.minutes();
        return total;
    }
}
