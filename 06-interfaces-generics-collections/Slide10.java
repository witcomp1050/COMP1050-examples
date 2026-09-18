public class Slide10 {
    public static void main(String[] args) {
        System.out.println(new Badge().shout());
    }
}

interface Describable {
    String describe();
    default String shout() {
        return describe().toUpperCase() + "!";
    }
}

class Badge implements Describable {
    @Override public String describe() { return "Visitor badge"; }
}
