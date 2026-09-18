public class Slide23 {
    public static void main(String[] args) {
        String typed = new String("yes");
        String expected = "yes";
        
        System.out.println(typed == expected);
        System.out.println(typed.equals(expected));
        System.out.println("YES".equalsIgnoreCase(expected));
        System.out.println("apple".compareTo("banana"));
    }
}
