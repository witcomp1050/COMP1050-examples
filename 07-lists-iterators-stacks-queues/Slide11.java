import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Slide11 {
    public static void main(String[] args) {
        List<Integer> minutes = new ArrayList<>(List.of(35, 20, 40, 15));
        Collections.sort(minutes);
        System.out.println(minutes);

        List<String> topics = new ArrayList<>(List.of("Maps", "arrays", "Loops"));
        topics.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println(topics);
        topics.sort(Comparator.reverseOrder());
        System.out.println(topics);
    }
}
