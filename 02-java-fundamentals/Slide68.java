public class Slide68 {
    static boolean inRange(int value, int low, int high) {
        return value >= low && value <= high;
    }

    static boolean validMinutes(int minutes) {
        return inRange(minutes, 1, 1440);
    }

    static String classify(int minutes) {
        if (!validMinutes(minutes)) {
            return "invalid";
        }
        return minutes >= 30 ? "full" : "short";
    }
    public static void main(String[] args) {
        System.out.println(classify(45) + " " + classify(10));
        System.out.println(classify(0) + " " + classify(2000));
    }
}
