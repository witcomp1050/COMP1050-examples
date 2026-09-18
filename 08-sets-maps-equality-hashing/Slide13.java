import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Slide13 {
    public static void main(String[] args) {
        Map<String, Integer> counts = new TreeMap<>();
        for (String w : List.of("java", "maps", "java")) {
            if (counts.containsKey(w)) counts.put(w, counts.get(w) + 1);
            else counts.put(w, 1);
        }
        System.out.println(counts);

        Map<String, Integer> again = new TreeMap<>();
        for (String w : List.of("java", "maps", "java")) {
            again.merge(w, 1, Integer::sum);
        }
        System.out.println(again);
    }
}
