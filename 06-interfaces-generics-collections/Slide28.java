import java.util.HashMap;
import java.util.Map;

public class Slide28 {
    public static void main(String[] args) {
        Map<String, Integer> minutesByTopic = new HashMap<>();
        minutesByTopic.put("Maps", 30);
        minutesByTopic.put("Loops", 20);
        minutesByTopic.put("Maps", 45);
        System.out.println(minutesByTopic.get("Maps"));
        System.out.println(minutesByTopic.get("Sets"));
        System.out.println(minutesByTopic.containsKey("Loops"));
        System.out.println(minutesByTopic.size());
    }
}
