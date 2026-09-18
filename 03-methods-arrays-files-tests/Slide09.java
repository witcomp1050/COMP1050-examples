public class Slide09 {
    static int parseMinutes(String text) {
        int value = Integer.parseInt(text.strip());
        if (value < 0) {
            throw new IllegalArgumentException("negative: " + value);
        }
        if (value > 1440) {
            throw new IllegalArgumentException("over one day: " + value);
        }
        return value;
    }
    public static void main(String[] args) {
        System.out.println(parseMinutes(" 45 "));
        try {
            parseMinutes("-5");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
