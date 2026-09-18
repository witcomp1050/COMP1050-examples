public class Slide34 {
    public static void main(String[] args) {
        int score = 58;
        
        if (score >= 60) {
            System.out.println("Pass");
        } else {
            System.out.println("Not yet");
        }
        
        boolean even = score % 2 == 0;
        if (even) {
            System.out.println(score + " is even");
        } else {
            System.out.println(score + " is odd");
        }
    }
}
