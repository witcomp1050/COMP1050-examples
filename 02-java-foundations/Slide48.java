public class Slide48 {
    static int total(int[] values) {
        int sum = 0;
        for (int value : values) sum += value;
        return sum;
    }

    static double average(int[] values) {
        if (values.length == 0) return 0.0;
        return (double) total(values) / values.length;
    }
    public static void main(String[] args) {
        int[] minutes = {20, 35, 15, 40};
        System.out.println(total(minutes));
        System.out.println(average(minutes));
    }
}
