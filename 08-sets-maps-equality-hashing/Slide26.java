import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Slide26 {
    public static void main(String[] args) {
        List<String> words = List.of("maps", "java", "sets", "arrays");
        Map<String, Integer> byInsertion = new LinkedHashMap<>();
        Map<String, Integer> sorted = new TreeMap<>();
        for (String w : words) { byInsertion.put(w, w.length()); sorted.put(w, w.length()); }
        System.out.println(byInsertion);
        System.out.println(sorted);
        System.out.println(new HashMap<>(sorted).size());
    }
}
