public class Slide16 {
    public static void main(String[] args) {
        Equipment e = new Camera("C-7", "Canon EOS", 24);
        System.out.println(e);
        System.out.println("Item: " + e);
    }
}

class Equipment {
    private final String id;
    private final String description;
    Equipment(String id, String description) { this.id = id; this.description = description; }
    String describe() { return id + ": " + description; }
    @Override
    public String toString() { return describe(); }
}

class Camera extends Equipment {
    private final int megapixels;
    Camera(String id, String description, int megapixels) {
        super(id, description);
        this.megapixels = megapixels;
    }
    @Override String describe() { return super.describe() + " (" + megapixels + " MP)"; }
}
