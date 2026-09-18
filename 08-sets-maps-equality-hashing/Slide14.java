import java.util.Map;
import java.util.TreeMap;

public class Slide14 {
    public static void main(String[] args) {
        Map<String, Integer> counts = new TreeMap<>(Map.of("java", 2, "maps", 1, "sets", 3));
        for (Map.Entry<String, Integer> e : counts.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
        System.out.println(counts.keySet());
        int total = 0;
        for (int v : counts.values()) total += v;
        System.out.println(total);
    }
}
