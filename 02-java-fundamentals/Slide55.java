public class Slide55 {
    public static void main(String[] args) {
        int[] minutes = {25, 0, 40, -5, 15};
        int total = 0;
        
        for (int i = 0; i < minutes.length; i++) {
            if (minutes[i] < 0) {
                System.out.println("Negative at position " + i + ", stopping.");
                break;
            }
            if (minutes[i] == 0) {
                continue;
            }
            total += minutes[i];
        }
        System.out.println("Total " + total);
    }
}
