public class Slide13 {
    public static void main(String[] args) {
        int totalMinutes = 135;
        int hours = totalMinutes / 60;
        int minutes = totalMinutes % 60;
        System.out.println(hours + " h " + minutes + " min");
        
        int number = 47;
        System.out.println(number % 10);
        System.out.println(number % 2 == 0);
    }
}
