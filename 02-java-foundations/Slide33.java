public class Slide33 {
    static int larger(int first, int second) {
        if (first >= second) {
            return first;
        }
        return second;
    }
    public static void main(String[] args) {
        int result = larger(8, 5);
        System.out.println(result);
    }
}
