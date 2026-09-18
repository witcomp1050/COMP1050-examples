public class Slide43 {
    public static void main(String[] args) {
        int minutes = 45;
        String label = minutes >= 30 ? "full" : "short";
        System.out.println(label);
        
        int a = 7, b = 12;
        int larger = a > b ? a : b;
        System.out.println(larger);
        System.out.println(Math.max(a, b));
    }
}
