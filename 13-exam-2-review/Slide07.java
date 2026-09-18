import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Slide07 {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(List.of(5, 1, 4));
        a.add(0, 9);
        a.remove(Integer.valueOf(4));
        a.remove(0);
        System.out.println(a);
        
        Deque<String> stack = new ArrayDeque<>();
        stack.push("A"); stack.push("B"); stack.push("C");
        System.out.println(stack.pop() + stack.peek() + stack.size());
    }
}
