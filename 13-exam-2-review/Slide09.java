import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Slide09 {
    record Tag(String name) { }
    public static void main(String[] args) {
        Set<Tag> tags = new HashSet<>(List.of(new Tag("java"), new Tag("java"), new Tag("fx")));
        System.out.println(tags.size());
        Map<String, Integer> counts = new TreeMap<>();
        for (String w : "b a b c a b".split(" ")) counts.merge(w, 1, Integer::sum);
        System.out.println(counts);
        System.out.println(counts.getOrDefault("z", 0));
    }
}
