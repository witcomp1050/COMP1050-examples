public class Slide12 {
    public static void main(String[] args) {
        Laptop l = new Laptop("L-1", "ThinkPad", 14.0);
        System.out.println(l.describe());
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
