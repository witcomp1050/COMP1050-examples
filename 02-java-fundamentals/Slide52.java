import java.util.Scanner;

public class Slide52 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int minutes = -1;
        
        while (minutes < 1 || minutes > 1440) {
            System.out.print("Minutes (1 to 1440): ");
            String text = in.nextLine().trim();
            if (text.matches("\\d+")) {
                minutes = Integer.parseInt(text);
            }
            if (minutes < 1 || minutes > 1440) {
                System.out.println("Not valid, try again.");
            }
        }
        System.out.println("Recorded " + minutes);
    }
}
