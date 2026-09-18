public class Slide50 {
    public static void main(String[] args) {
        int[] minutes = {25, 40, 15, 50};
        int total = 0;
        int count = 0;
        int longest = minutes[0];
        
        for (int i = 0; i < minutes.length; i++) {
            total += minutes[i];
            if (minutes[i] >= 30) {
                count++;
            }
            if (minutes[i] > longest) {
                longest = minutes[i];
            }
        }
        System.out.println(total + " " + count + " " + longest);
        System.out.println((double) total / minutes.length);
    }
}
