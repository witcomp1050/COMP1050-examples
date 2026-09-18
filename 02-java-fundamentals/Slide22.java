public class Slide22 {
    public static void main(String[] args) {
        String s = "  Computer Science  ";
        String t = s.trim();
        System.out.println("[" + t + "]");
        System.out.println(t.length());
        System.out.println(t.charAt(0));
        System.out.println(t.toUpperCase());
        System.out.println(t.indexOf("Sci"));
        System.out.println(t.substring(9));
        System.out.println(t.contains("put"));
    }
}
