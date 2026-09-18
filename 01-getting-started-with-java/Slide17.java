public class Slide17 {
    static double fahrenheit(double celsius) {
        if (!Double.isFinite(celsius)) {
            throw new IllegalArgumentException("Use a finite value.");
        }
        return celsius * 9.0 / 5.0 + 32.0;
    }
    public static void main(String[] args) {
        System.out.println("0 C = " + fahrenheit(0) + " F");
    }
}
