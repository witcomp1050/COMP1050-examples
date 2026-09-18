public class Slide14 {
    static String show(Equipment e) { return "Equipment version"; }
    static String show(Laptop l) { return "Laptop version"; }
    public static void main(String[] args) {
        Equipment e = new Laptop("L-1", "ThinkPad", 14.0);
        System.out.println(show(e));
        System.out.println(show(new Laptop("L-2", "XPS", 13.0)));
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
    private final double screenInches;
    Laptop(String id, String description, double screenInches) {
        super(id, description);
        this.screenInches = screenInches;
    }
    double screenInches() { return screenInches; }
    @Override String describe() { return super.describe() + " (" + screenInches + "\" screen)"; }
}
