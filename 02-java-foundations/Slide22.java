public class Slide22 {
    public static void main(String[] args) {
        int minutes = 30;
        if (minutes < 0) {
            System.out.println("Invalid");
        } else if (minutes >= 30) {
            System.out.println("Goal met");
        } else {
            System.out.println("Keep going");
        }
    }
}
