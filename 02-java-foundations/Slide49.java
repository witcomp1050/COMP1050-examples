public class Slide49 {
    static int countAtLeast(int[] values, int goal) {
        int count = 0;
        for (int value : values) {
            if (value >= goal) count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int[] minutes = {20, 35, 15, 40};
        System.out.println(countAtLeast(minutes, 30));
    }
}
