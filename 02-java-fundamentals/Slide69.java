public class Slide69 {
    static int max(int a, int b) {
        return a > b ? a : b;
    }

    static int max(int a, int b, int c) {
        return max(max(a, b), c);
    }

    static double max(double a, double b) {
        return a > b ? a : b;
    }
    public static void main(String[] args) {
        System.out.println(max(3, 9));
        System.out.println(max(3, 9, 5));
        System.out.println(max(2.5, 1.5));
    }
}
