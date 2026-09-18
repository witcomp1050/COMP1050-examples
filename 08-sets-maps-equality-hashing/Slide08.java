import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Slide08 {
    public static void main(String[] args) {
        List<String> words = List.of("maps", "java", "sets", "arrays");
        System.out.println(new LinkedHashSet<>(words));
        System.out.println(new TreeSet<>(words));
        Set<String> hashed = new HashSet<>(words);
        System.out.println(hashed.size());
    }
}
