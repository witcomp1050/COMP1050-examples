public class Slide13 {
    static long sum(int[] values, int index) {
        if (index == values.length) return 0;
        return values[index] + sum(values, index + 1);
    }
    public static void main(String[] args) {
        int[] minutes = {2, -1, 4};
        System.out.println(sum(minutes, 0));
        System.out.println(sum(minutes, 1));
    }
}
