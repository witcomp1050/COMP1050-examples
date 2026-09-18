public class Slide20 {
    public static void main(String[] args) {
        String day = "WED";
        String meeting = switch (day) {
            case "MON", "FRI" -> "lecture";
            case "WED" -> "lab";
            default -> "no class";
        };
        System.out.println(meeting);
    }
}
