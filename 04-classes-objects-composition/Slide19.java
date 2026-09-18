public class Slide19 {
    public static void main(String[] args) {
        Counter[] counters = new Counter[3];
        System.out.println(counters[0]);
        counters[0] = new Counter(5);
        counters[1] = counters[0];
        counters[1].increment();
        System.out.println(counters[0].value());
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
