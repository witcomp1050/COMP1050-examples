import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Slide19 {
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
    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (!(other instanceof Student s)) return false;
        return id.equals(s.id);
    }
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
