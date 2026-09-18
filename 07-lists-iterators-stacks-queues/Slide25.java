import java.util.ArrayDeque;
import java.util.Queue;

public class Slide25 {
    public static void main(String[] args) {
        Queue<String> waiting = new ArrayDeque<>();
        waiting.offer("R1");
        waiting.offer("R2");
        waiting.offer("R3");
        System.out.println(waiting.peek());
        System.out.println(waiting.poll());
        System.out.println(waiting);
        System.out.println(waiting.poll() + " " + waiting.poll() + " " + waiting.poll());
    }
}
