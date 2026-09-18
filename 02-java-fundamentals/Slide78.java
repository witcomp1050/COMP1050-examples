public class Slide78 {
    static int countAtLeast(int[] values, int threshold) {
        int count = 0;
        for (int v : values) {
            if (v >= threshold) {
                count++;
            }
        }
        return count;
    }

    static int largest(int[] values) {
        int best = values[0];
        for (int i = 1; i < values.length; i++) {
            if (values[i] > best) {
                best = values[i];
            }
        }
        return best;
    }
    public static void main(String[] args) {
        int[] minutes = {20, 35, 15, 40};
        System.out.println(countAtLeast(minutes, 30) + " " + largest(minutes));
    }
}
