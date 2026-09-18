public class Slide38 {
    public static void main(String[] args) {
        int minutes = 90;
        boolean inRange = minutes >= 1 && minutes <= 1440;
        System.out.println(inRange);
        
        String day = "Sat";
        boolean weekend = day.equals("Sat") || day.equals("Sun");
        System.out.println(weekend);
        
        boolean weekday = !weekend;
        System.out.println(weekday);
        
        if (inRange && weekend) {
            System.out.println("Weekend session recorded.");
        }
    }
}
