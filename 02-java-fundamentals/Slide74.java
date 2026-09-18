public class Slide74 {
    public static void main(String[] args) {
        int[] minutes = new int[4];
        minutes[0] = 20;
        minutes[1] = 35;
        minutes[3] = 40;
        System.out.println(minutes[1] + " " + minutes[2] + " " + minutes.length);
        
        String[] days = {"Mon", "Wed", "Fri"};
        days[2] = "Sat";
        System.out.println(days[0] + " " + days[2] + " " + days.length);
        double[] scores = new double[3];
        boolean[] flags = new boolean[2];
        System.out.println(scores[0] + " " + flags[1]);
    }
}
