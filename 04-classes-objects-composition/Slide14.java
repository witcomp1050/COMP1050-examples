public class Slide14 {
    public static void main(String[] args) {
        Counter first = new Counter(0);
        Counter second = new Counter(0);
        second.increment();
        System.out.println(first.value());
        System.out.println(first == second);
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
