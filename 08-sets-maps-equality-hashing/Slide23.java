import java.util.HashSet;
import java.util.Set;

public class Slide23 {
    record Student(String id) { }
    public static void main(String[] args) {
        Set<Student> roster = new HashSet<>();
        roster.add(new Student("W1"));
        roster.add(new Student("W1"));
        System.out.println(roster.size());
        System.out.println(new Student("W1").hashCode() == new Student("W1").hashCode());
    }
}
