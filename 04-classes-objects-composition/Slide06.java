public class Slide06 {
    public static void main(String[] args) {
        StudySession s = new StudySession("Generics", 45);
        System.out.println(s.minutes());
    }
}

class StudySession {
    private String topic;
    private int minutes;

    StudySession(String topic, int minutes) {
        this.topic = topic;
        this.minutes = minutes;
    }

    int minutes() { return minutes; }
}
