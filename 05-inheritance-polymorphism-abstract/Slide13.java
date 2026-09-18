import java.util.List;

public class Slide13 {
    public static void main(String[] args) {
        Equipment e = new Laptop("L-1", "ThinkPad", 14.0);
        System.out.println(e.describe());

        List<Equipment> items = List.of(
            new Laptop("L-1", "ThinkPad", 14.0),
            new Camera("C-7", "Canon EOS", 24));
        for (Equipment item : items) {
            System.out.println(item.describe());
        }
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

class Camera extends Equipment {
    private final int megapixels;
    Camera(String id, String description, int megapixels) {
        super(id, description);
        this.megapixels = megapixels;
    }
    @Override String describe() { return super.describe() + " (" + megapixels + " MP)"; }
}
