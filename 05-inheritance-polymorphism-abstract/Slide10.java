public class Slide10 {
    public static void main(String[] args) {
        Object o = new Laptop("L-1", "ThinkPad", 14.0);
        System.out.println(o instanceof Equipment);
        System.out.println(o instanceof Laptop);
        System.out.println(o.getClass().getSimpleName());
    }
}

class Equipment {
    private final String id;
    private final String description;
    Equipment(String id, String description) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("blank id");
        this.id = id; this.description = description;
    }
    String id() { return id; }
    String description() { return description; }
    String describe() { return id + ": " + description; }
}

class Laptop extends Equipment {
    Laptop(String id, String description, double screenInches) { super(id, description); }
}
