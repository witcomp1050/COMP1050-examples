import java.util.ArrayList;
import java.util.List;

public class Slide07 {
    public static void main(String[] args) {
        List<String> queue = new ArrayList<>(List.of("R1", "R2", "R3", "R4"));
        System.out.println(queue.get(2));
        queue.add(1, "URGENT");
        System.out.println(queue);
        queue.remove(0);
        System.out.println(queue);
        System.out.println(queue.indexOf("R3"));
    }
}
