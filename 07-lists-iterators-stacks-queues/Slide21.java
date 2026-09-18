import java.util.ArrayDeque;
import java.util.Deque;

public class Slide21 {
    public static void main(String[] args) {
        Deque<String> undo = new ArrayDeque<>();
        undo.push("typed a");
        undo.push("typed b");
        undo.push("deleted b");
        System.out.println(undo.peek());
        System.out.println(undo.pop());
        System.out.println(undo.pop());
        System.out.println(undo.size());
    }
}
