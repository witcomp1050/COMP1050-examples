import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Slide13 {
    public static void main(String[] args) {
        List<String> topics = new ArrayList<>(List.of("Maps", "arrays", "Loops"));
        topics.sort((a, b) -> a.compareToIgnoreCase(b));
        System.out.println(topics);
        topics.sort(Comparator.comparing(String::length));
        System.out.println(topics);
    }
}
