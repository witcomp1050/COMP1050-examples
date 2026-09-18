import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class Slide07 {
    public static void main(String[] args) {
        List<String> raw = List.of(" Java", "JAVA", "java ", "Maps", "");
        Set<String> unique = new HashSet<>();
        for (String w : raw) {
            String n = w.strip().toLowerCase(Locale.ROOT);
            if (!n.isEmpty()) unique.add(n);
        }
        System.out.println(unique.size());
        System.out.println(unique.contains("java"));
    }
}
