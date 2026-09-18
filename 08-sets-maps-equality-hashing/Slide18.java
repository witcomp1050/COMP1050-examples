import java.util.HashSet;
import java.util.Set;

public class Slide18 {
    public static void main(String[] args) {
        Set<Student> roster = new HashSet<>();
        roster.add(new Student("W1"));
        roster.add(new Student("W1"));
        System.out.println(roster.size());
        System.out.println(roster.contains(new Student("W1")));
    }
}

final class Student {
    private final String id;
    Student(String id) { this.id = id; }
}
