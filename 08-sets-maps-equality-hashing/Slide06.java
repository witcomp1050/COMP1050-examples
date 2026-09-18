import java.util.HashSet;
import java.util.Set;

public class Slide06 {
    public static void main(String[] args) {
        Set<String> words = new HashSet<>();
        System.out.println(words.add("java"));
        System.out.println(words.add("java"));
        words.add("maps");
        words.add("sets");
        System.out.println(words.size());
        System.out.println(words.contains("maps"));
        System.out.println(words.remove("loops"));
    }
}
