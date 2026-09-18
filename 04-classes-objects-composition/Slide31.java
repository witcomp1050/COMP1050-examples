import java.util.Objects;

public class Slide31 {
    public static void main(String[] args) {
        Loan loan = new Loan(new Equipment("L-100"), new Student("W0123"));
        System.out.println(loan.student().id());
        try {
            new Loan(null, new Student("W0123"));
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}

final class Equipment {
    private final String id;
    Equipment(String id) { this.id = id; }
    String id() { return id; }
}

final class Student {
    private final String id;
    Student(String id) { this.id = id; }
    String id() { return id; }
}

final class Loan {
    private final Equipment equipment;
    private final Student student;
    private boolean active = true;
    Loan(Equipment equipment, Student student) {
        this.equipment = Objects.requireNonNull(equipment, "equipment");
        this.student = Objects.requireNonNull(student, "student");
    }
    Student student() { return student; }
}
