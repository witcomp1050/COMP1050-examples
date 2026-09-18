import java.util.Iterator;
import java.util.List;

public class Slide15 {
    public static void main(String[] args) {
        List<String> topics = List.of("Setup", "Maps", "Loops");
        Iterator<String> it = topics.iterator();
        while (it.hasNext()) {
            String topic = it.next();
            System.out.println(topic);
        }
        for (String topic : topics) {
            System.out.println(topic);
        }
    }
}
