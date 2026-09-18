public class Slide20 {
    public static void main(String[] args) {
        String text = "thirty";
        try {
            int minutes = Integer.parseInt(text);
            System.out.println("Parsed " + minutes);
        } catch (NumberFormatException e) {
            System.out.println("Not a whole number: " + text);
        }
        System.out.println("Program continues");
    }
}
