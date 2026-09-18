import java.util.Objects;

public class Slide16 {
    static final int MAX_LENGTH = 100;
    public static long sum(int[] values, int index) {
        Objects.requireNonNull(values, "values");
        if (values.length > MAX_LENGTH) throw new IllegalArgumentException("too long");
        if (index < 0 || index > values.length) throw new IndexOutOfBoundsException("index " + index);
        return sumFrom(values, index);
    }
    private static long sumFrom(int[] values, int index) {
        if (index == values.length) return 0;
        return values[index] + sumFrom(values, index + 1);
    }
    public static void main(String[] args) {
        System.out.println(sum(new int[] {2, -1, 4}, 0));
        try { sum(new int[] {1}, -1); } catch (IndexOutOfBoundsException e) { System.out.println(e.getMessage()); }
        try { sum(new int[MAX_LENGTH + 1], 0); } catch (IllegalArgumentException e) { System.out.println(e.getMessage()); }
    }
}
