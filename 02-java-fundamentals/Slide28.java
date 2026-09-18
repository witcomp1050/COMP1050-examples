import java.util.Scanner;

public class Slide28 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Sessions: ");
        int sessions = in.nextInt();
        System.out.print("Name: ");
        String name = in.nextLine();
        System.out.println("[" + name + "] " + sessions);
    }
}
