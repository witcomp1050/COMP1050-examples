public class Slide25 {
    public static void main(String[] args) {
        System.out.println(new Student(" W0123 ").id());
    }
}

final class Student {
    private final String id;
    Student(String id) {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("Student id must not be blank");
        }
        this.id = id.strip();
    }
    String id() { return id; }
}
