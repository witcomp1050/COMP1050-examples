public class Slide57 {
    public static void main(String[] args) {
        String text = "Computer Science";
        int vowels = 0;
        
        for (int i = 0; i < text.length(); i++) {
            char c = Character.toLowerCase(text.charAt(i));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowels++;
            }
        }
        System.out.println(vowels + " vowels in \"" + text + "\"");
        
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        System.out.println(reversed);
    }
}
