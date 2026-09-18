public class Slide07 {
    /** Average of the values; 0.0 when there are none. */
    static double average(int[] values) {
        if (values.length == 0) return 0.0;
        long total = 0;
        for (int v : values) total += v;
        return (double) total / values.length;
    }
    public static void main(String[] args) {
        System.out.println(average(new int[] {20, 35, 15, 40}));
        System.out.println(average(new int[] {}));
    }
}
