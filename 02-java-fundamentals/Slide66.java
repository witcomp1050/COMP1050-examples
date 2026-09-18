public class Slide66 {
    static double average(int[] values) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("values must not be empty");
        }
        int total = 0;
        for (int v : values) {
            total += v;
        }
        return (double) total / values.length;
    }
    public static void main(String[] args) {
        System.out.println(average(new int[] {30, 45, 0}));
        System.out.println(average(new int[0]));
    }
}
