import java.util.List;
import java.util.PriorityQueue;

public class Slide28 {
    public static void main(String[] args) {
        PriorityQueue<Integer> waits = new PriorityQueue<>(List.of(35, 20, 40, 15));
        System.out.println(waits.peek());
        System.out.println(waits);
        StringBuilder out = new StringBuilder();
        while (!waits.isEmpty()) out.append(waits.poll()).append(' ');
        System.out.println(out.toString().strip());
    }
}
