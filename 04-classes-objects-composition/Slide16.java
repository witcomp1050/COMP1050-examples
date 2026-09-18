public class Slide16 {
    static void bump(Counter c) {
        c.increment();
        c = new Counter(100);
        c.increment();
    }
    public static void main(String[] args) {
        Counter counter = new Counter(0);
        bump(counter);
        System.out.println(counter.value());
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
