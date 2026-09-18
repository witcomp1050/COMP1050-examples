public class Slide27 {
    public static void main(String[] args) {
        Equipment e = new Camera("C-7", "Canon EOS", 24);
        Laptop l = (Laptop) e;
        System.out.println(l.screenInches());
    }
}

abstract class Equipment {
    private final String id;
    private final String description;
    Equipment(String id, String description) { this.id = id; this.description = description; }
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
