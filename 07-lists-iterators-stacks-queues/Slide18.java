import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Slide18 {
    public static void main(String[] args) {
        Deque<String> stack = new ArrayDeque<>(List.of("a", "b", "c"));
        Set<Integer> ids = new TreeSet<>(List.of(3, 1, 2));
        for (String s : stack) System.out.print(s + " ");
        System.out.println();
        for (int id : ids) System.out.print(id + " ");
        System.out.println();
    }
}
