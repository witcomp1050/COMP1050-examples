public class Slide61 {
    static int square(int n) {
        return n * n;
    }
    public static void main(String[] args) {
        int area = square(7);
        System.out.println(area);
        System.out.println(square(3) + square(4));
        System.out.println(square(square(2)));
    }
}
