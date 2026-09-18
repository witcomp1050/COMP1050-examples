public class Slide23 {
    public static void main(String[] args) {
        new Laptop("", "ThinkPad", 14.0);
    }
}

abstract class Equipment {
    private final String id;
    private final String description;
    Equipment(String id, String description) {
        if (id == null || id.isBlank()) throw new IllegalArgumentException("blank id");
        this.id = id; this.description = description;
    }
    String id() { return id; }
    abstract String category();
    String describe() { return category() + " " + id + ": " + description; }
}
class Laptop extends Equipment {
    private final double screenInches;
    Laptop(String id, String description, double screenInches) { super(id, description); this.screenInches = screenInches; }
    double screenInches() { return screenInches; }
    @Override String category() { return "Laptop"; }
}
class Camera extends Equipment {
    private final int megapixels;
    Camera(String id, String description, int megapixels) { super(id, description); this.megapixels = megapixels; }
    @Override String category() { return "Camera"; }
}
