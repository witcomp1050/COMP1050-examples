import java.util.Scanner;

public class Slide51 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int total = 0;
        int count = 0;
        
        System.out.println("Enter minutes per session; -1 to finish.");
        int value = Integer.parseInt(in.nextLine().trim());
        while (value != -1) {
            total += value;
            count++;
            value = Integer.parseInt(in.nextLine().trim());
        }
        System.out.println(count + " sessions, " + total + " minutes");
    }
}
