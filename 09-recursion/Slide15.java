public class Slide15 {
    static boolean contains(int[] values, int index, int target) {
        if (index == values.length) return false;
        if (values[index] == target) return true;
        return contains(values, index + 1, target);
    }
    public static void main(String[] args) {
        int[] v = {2, -1, 4};
        System.out.println(contains(v, 0, 4));
        System.out.println(contains(v, 1, 2));
        System.out.println(contains(v, 0, 7));
    }
}
