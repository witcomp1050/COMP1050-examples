public class Slide88 {
    public static void main(String[] args) {
        int[] minutes = {25, 40, 15, 50};
        int total = 0;
        for (int i = 1; i < minutes.length; i++) {
            total += minutes[i];
        }
        double average = total / minutes.length;
        System.out.println(average);
    }
}
