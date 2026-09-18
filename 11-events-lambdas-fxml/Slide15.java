public class Slide15 {
    interface Check {
        boolean test(int value);
    }

    static int countIf(int[] values, Check check) {
        int count = 0;
        for (int v : values) if (check.test(v)) count++;
        return count;
    }
    public static void main(String[] args) {
        int[] minutes = {20, 35, 15, 40};
        System.out.println(countIf(minutes, v -> v >= 30));
        System.out.println(countIf(minutes, v -> v > 15));
    }
}
