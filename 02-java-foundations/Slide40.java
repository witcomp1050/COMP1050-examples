public class Slide40 {
    public static void main(String[] args) {
        int[] minutes = {20, 35, 15, 40};
        int total = 0;
        for (int i = 0; i < minutes.length; i++) {
            total += minutes[i];
        }
        System.out.println(total);
        
        int again = 0;
        for (int value : minutes) {
            again += value;
        }
        System.out.println(again);
    }
}
