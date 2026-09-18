public class Slide07 {
    public static void main(String[] args) {
        new Laptop("L-1");
    }
}

class Equipment {
    Equipment(String id) {
        System.out.println("Equipment constructor");
    }
}

class Laptop extends Equipment {
    Laptop(String id) {
        super(id);
        System.out.println("Laptop constructor");
    }
}
