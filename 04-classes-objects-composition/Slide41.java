public class Slide41 {
    record StudySession(String topic, int minutes) {
        StudySession {
            if (topic == null || topic.isBlank()) {
                throw new IllegalArgumentException("Topic must not be blank");
            }
            if (minutes < 1) {
                throw new IllegalArgumentException("Minutes must be positive");
            }
            topic = topic.strip();
        }
    }
    public static void main(String[] args) {
        System.out.println(new StudySession("  Maps ", 30).topic());
        try {
            new StudySession("  ", 30);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
