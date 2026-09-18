import java.util.List;

public class Slide20 {
    static <T> T first(List<T> items) {
        if (items.isEmpty()) throw new IllegalArgumentException("empty");
        return items.get(0);
    }
    public static void main(String[] args) {
        String s = first(List.of("Maps", "Loops"));
        Integer n = first(List.of(30, 45));
        System.out.println(s + " " + n);
    }
}
