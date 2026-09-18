public class Slide17 {
    public static void main(String[] args) {
        int big = 2147483647;
        System.out.println(big + 1);
        
        long bigger = 2147483647L;
        System.out.println(bigger + 1);
        
        int minutes = 1440;
        int people = 2_000_000;
        System.out.println((long) minutes * people);
    }
}
