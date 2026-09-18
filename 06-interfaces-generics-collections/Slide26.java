import java.util.ArrayList;
import java.util.List;

public class Slide26 {
    public static void main(String[] args) {
        List<String> topics = new ArrayList<>(List.of("Maps", "Loops"));
        topics.add("Generics");
        topics.add(0, "Setup");
        System.out.println(topics);
        System.out.println(topics.indexOf("Loops"));
        topics.remove("Maps");
        System.out.println(topics.size() + " " + topics.contains("Maps"));
    }
}
