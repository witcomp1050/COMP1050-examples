public class Slide25 {
    public static void main(String[] args) {
        String name = "Ada";
        int sessions = 3;
        double average = 25.0 / 3;
        
        System.out.println(average);
        System.out.printf("%s: %d sessions, %.2f min average%n", name, sessions, average);
        System.out.printf("[%5d] [%-5d] [%6.1f]%n", 42, 42, 3.14159);
        String line = String.format("%d%%", 95);
        System.out.println(line);
    }
}
