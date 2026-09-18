public class Slide07 {
    public static void main(String[] args) {
        StudySession a = new StudySession("Generics", 45);
        StudySession b = new StudySession("Maps", 30);
        System.out.println(a.minutes());
        System.out.println(b.minutes());
        System.out.println(a == b);
    }
}

class StudySession {
    private String topic;
    private int minutes;
    StudySession(String topic, int minutes) { this.topic = topic; this.minutes = minutes; }
    int minutes() { return minutes; }
}
