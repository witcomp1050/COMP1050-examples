public class Slide42 {
    public static void main(String[] args) {
        String day = "Wed";
        
        String kind = switch (day) {
            case "Sat", "Sun" -> "weekend";
            case "Wed" -> "lab day";
            default -> "lecture day";
        };
        System.out.println(kind);
        
        int month = 2;
        int days = switch (month) {
            case 2 -> 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
        System.out.println(days);
    }
}
