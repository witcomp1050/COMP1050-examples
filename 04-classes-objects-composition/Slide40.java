public class Slide40 {
    record StudySession(String topic, int minutes) { }
    public static void main(String[] args) {
        StudySession a = new StudySession("Maps", 30);
        StudySession b = new StudySession("Maps", 30);
        System.out.println(a);
        System.out.println(a.equals(b));
        System.out.println(a == b);
        System.out.println(a.minutes());
    }
}
