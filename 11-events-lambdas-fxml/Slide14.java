import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Slide14 {
    public static void main(String[] args) {
        List<Integer> minutes = new ArrayList<>(List.of(20, 35, 15, 40));
        int goal = 30;
        minutes.removeIf(m -> m < goal);
        System.out.println(minutes);
        
        Map<String, Integer> counts = new TreeMap<>();
        for (String w : List.of("java", "maps", "java")) counts.merge(w, 1, Integer::sum);
        System.out.println(counts);
        
        Map<String, List<String>> groups = new TreeMap<>();
        groups.computeIfAbsent("W1", k -> new ArrayList<>()).add("L-1");
        System.out.println(groups);
    }
}
