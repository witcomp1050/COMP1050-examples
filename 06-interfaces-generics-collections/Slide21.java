import java.util.List;

public class Slide21 {
    static <T extends Comparable<T>> T largest(List<T> items) {
        T best = items.get(0);
        for (T item : items) {
            if (item.compareTo(best) > 0) best = item;
        }
        return best;
    }
    public static void main(String[] args) {
        System.out.println(largest(List.of(30, 45, 20)));
        System.out.println(largest(List.of("Maps", "Loops", "Arrays")));
    }
}
