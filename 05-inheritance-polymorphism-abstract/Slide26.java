import java.util.List;

public class Slide26 {
    public static void main(String[] args) {
        List<Equipment> items = List.of(new Laptop("L-1", "ThinkPad", 14.0), new Camera("C-7", "Canon EOS", 24));
        for (Equipment item : items) {
            if (item instanceof Laptop laptop) {
                System.out.println(laptop.screenInches());
            } else {
                System.out.println("not a laptop");
            }
        }
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
