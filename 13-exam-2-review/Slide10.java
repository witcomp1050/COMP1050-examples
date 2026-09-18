public class Slide10 {
    static int count(String s, char c) {
        if (s.isEmpty()) return 0;
        int rest = count(s.substring(1), c);
        return (s.charAt(0) == c ? 1 : 0) + rest;
    }

    static boolean palindrome(String s) {
        if (s.length() < 2) return true;
        if (s.charAt(0) != s.charAt(s.length() - 1)) return false;
        return palindrome(s.substring(1, s.length() - 1));
    }
    public static void main(String[] args) {
        System.out.println(count("banana", 'a'));
        System.out.println(palindrome("level") + " " + palindrome("levels"));
    }
}
