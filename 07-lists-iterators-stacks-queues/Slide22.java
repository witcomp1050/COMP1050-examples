import java.util.ArrayDeque;
import java.util.Deque;

public class Slide22 {
    static boolean balanced(String text) {
        Deque<Character> open = new ArrayDeque<>();
        for (char c : text.toCharArray()) {
            if (c == '(' || c == '[') open.push(c);
            else if (c == ')' || c == ']') {
                if (open.isEmpty()) return false;
                char last = open.pop();
                if ((c == ')') != (last == '(')) return false;
            }
        }
        return open.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(balanced("(a[b]c)"));
        System.out.println(balanced("(a[b)c]"));
        System.out.println(balanced("(("));
    }
}
