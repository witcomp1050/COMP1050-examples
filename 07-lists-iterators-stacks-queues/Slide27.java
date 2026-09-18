import java.util.ArrayDeque;
import java.util.Deque;

public class Slide27 {
    public static void main(String[] args) {
        Deque<String> line = new ArrayDeque<>();
        line.addLast("R1");
        line.addLast("R2");
        line.addFirst("VIP");
        System.out.println(line);
        System.out.println(line.pollFirst());
        System.out.println(line.pollLast());
        System.out.println(line);
    }
}
