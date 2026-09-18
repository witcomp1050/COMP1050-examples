public class Slide29 {
    static int calls = 0;
    static int fib(int n) {
        calls++;
        if (n <= 1) return n;
        return fib(n - 1) + fib(n - 2);
    }
    public static void main(String[] args) {
        System.out.println(fib(10) + " after " + calls + " calls");
    }
}
