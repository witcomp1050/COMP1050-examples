public class Slide17 {
    public static void main(String[] args) {
        Counter c = null;
        System.out.println(c == null);
        System.out.println(c.value());
    }
}

final class Counter {
    private int value;
    Counter(int initial) {
        if (initial < 0) throw new IllegalArgumentException("Initial value must not be negative: " + initial);
        this.value = initial;
    }
    void increment() { value++; }
    int value() { return value; }
}
