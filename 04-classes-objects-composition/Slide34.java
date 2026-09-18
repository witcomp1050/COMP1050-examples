import java.util.Objects;

public class Slide34 {
    public static void main(String[] args) {
        Student ada = new Student("W0123");
        Loan laptop = new Loan(new Equipment("L-1"), ada);
        Loan camera = new Loan(new Equipment("C-7"), ada);
        System.out.println(laptop.student() == camera.student());
    }
}

final class Equipment {
    private final String id;
    Equipment(String id) { this.id = id; }
}

final class Student {
    private final String id;
    Student(String id) { this.id = id; }
}

final class Loan {
    private final Equipment equipment;
    private final Student student;
    Loan(Equipment equipment, Student student) {
        this.equipment = Objects.requireNonNull(equipment);
        this.student = Objects.requireNonNull(student);
    }
    Student student() { return student; }
}
