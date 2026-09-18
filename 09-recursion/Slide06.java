public class Slide06 {
    static int sumTo(int n) {
        if (n == 0) return 0;
        return n + sumTo(n - 1);
    }
    public static void main(String[] args) {
        System.out.println(sumTo(3));
    }
}
