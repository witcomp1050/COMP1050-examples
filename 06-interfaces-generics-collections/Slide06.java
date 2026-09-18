import java.util.List;

public class Slide06 {
    public static void main(String[] args) {
        List<Describable> items = List.of(new Badge(), new Laptop("L-1"));
        for (Describable d : items) System.out.println(d.describe());
    }
}

interface Describable {
    String describe();
}

class Badge implements Describable {
    @Override public String describe() { return "Visitor badge"; }
}

class Laptop implements Describable {
    private final String id;
    Laptop(String id) { this.id = id; }
    @Override public String describe() { return "Laptop " + id; }
}
