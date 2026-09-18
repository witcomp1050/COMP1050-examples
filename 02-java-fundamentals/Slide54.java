public class Slide54 {
    public static void main(String[] args) {
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.printf("%4d", row * col);
            }
            System.out.println();
        }
    }
}
