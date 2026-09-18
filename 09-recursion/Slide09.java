public class Slide09 {
    static int forever(int n) {
        return forever(n + 1);
    }
    public static void main(String[] args) {
        forever(0);
    }
}
