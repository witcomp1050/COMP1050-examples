public class Slide67 {
    static int twice(int n) {
        int result = n * 2;
        return result;
    }
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i < 3; i++) {
            int doubled = twice(i);
            total += doubled;
        }
        System.out.println(total);
    }
}
