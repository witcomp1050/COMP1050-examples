public class Slide77 {
    static int indexOf(int[] values, int target) {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] minutes = {20, 35, 15, 40};
        System.out.println(indexOf(minutes, 15));
        System.out.println(indexOf(minutes, 99));
        System.out.println(indexOf(minutes, 15) >= 0 ? "present" : "absent");
    }
}
