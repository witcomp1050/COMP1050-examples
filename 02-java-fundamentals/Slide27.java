import java.util.Scanner;

public class Slide27 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Your name: ");
        String name = in.nextLine();
        
        System.out.print("Sessions this week: ");
        int sessions = Integer.parseInt(in.nextLine().trim());
        
        System.out.println("Hi " + name + ", " + sessions + " sessions logged.");
        in.close();
    }
}
