public class Slide75 {
    public static void main(String[] args) {
        int[] minutes = {20, 35, 15, 40};
        
        for (int i = 0; i < minutes.length; i++) {
            System.out.println("Session " + (i + 1) + ": " + minutes[i]);
        }
        
        int total = 0;
        for (int m : minutes) {
            total += m;
        }
        System.out.println("Total " + total);
    }
}
