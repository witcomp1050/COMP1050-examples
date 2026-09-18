import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Slide45 {
    @Test void twoReferencesToOneObjectShareState() {
        Counter first = new Counter(0);
        Counter second = first;
        second.increment();
        assertEquals(1, first.value());
        assertSame(first, second);
    }

    @Test void rejectsNegativeInitialValue() {
        assertThrows(IllegalArgumentException.class, () -> new Counter(-1));
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
