import java.util.Scanner;

public class Slide53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String answer;
        
        do {
            System.out.print("Continue? (y/n): ");
            answer = in.nextLine().trim().toLowerCase();
        } while (!answer.equals("y") && !answer.equals("n"));
        
        System.out.println("You chose " + answer);
    }
}
