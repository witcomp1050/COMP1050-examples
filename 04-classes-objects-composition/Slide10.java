public class Slide10 {
    public static void main(String[] args) {
        System.out.println(new StudySession("Generics", 45));
    }
}

class StudySession {
    private String topic;
    private int minutes;
    StudySession(String topic, int minutes) { this.topic = topic; this.minutes = minutes; }
    @Override
    public String toString() {
        return topic + " (" + minutes + " min)";
    }
}
