import java.util.ArrayList;
import java.util.List;

public class Slide12 {
    public static void main(String[] args) {
        List<String> topics = new ArrayList<>(List.of("Setup", "Maps", "Loops", "Sets"));
        List<String> middle = topics.subList(1, 3);
        System.out.println(middle);
        middle.set(0, "MAPS");
        System.out.println(topics);
        List<String> frozen = List.copyOf(topics);
        System.out.println(frozen.equals(topics));
    }
}
