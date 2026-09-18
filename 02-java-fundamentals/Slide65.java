public class Slide65 {
    static void printLine(String label, int value) {
        System.out.println(label + ": " + value);
    }

    static void describe(int minutes) {
        if (minutes <= 0) {
            System.out.println("nothing to report");
            return;
        }
        printLine("minutes", minutes);
        printLine("hours", minutes / 60);
    }
    public static void main(String[] args) {
        describe(0);
        describe(135);
    }
}
