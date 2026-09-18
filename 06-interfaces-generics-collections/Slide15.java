import java.util.ArrayDeque;
import java.util.Queue;

public class Slide15 {
    public static void main(String[] args) {
        Queue<String> waiting = new ArrayDeque<>();
        waiting.add("R1");
        waiting.add("R2");
        System.out.println(waiting.peek());
        System.out.println(waiting.poll());
        System.out.println(waiting.poll());
        System.out.println(waiting.poll());
    }
}
