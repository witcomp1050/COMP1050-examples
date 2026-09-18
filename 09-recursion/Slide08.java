public class Slide08 {
    static int sumTo(int n, String indent) {
        System.out.println(indent + "call sumTo(" + n + ")");
        if (n == 0) {
            System.out.println(indent + "return 0");
            return 0;
        }
        int result = n + sumTo(n - 1, indent + "  ");
        System.out.println(indent + "return " + result);
        return result;
    }
    public static void main(String[] args) {
        sumTo(2, "");
    }
}
