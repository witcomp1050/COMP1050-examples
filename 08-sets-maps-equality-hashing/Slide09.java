import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Slide09 {
    public static void main(String[] args) {
        Set<String> lab1 = new TreeSet<>(List.of("ada", "bo", "cy"));
        Set<String> lab2 = new TreeSet<>(List.of("bo", "cy", "di"));
        Set<String> both = new TreeSet<>(lab1);
        both.retainAll(lab2);
        Set<String> either = new TreeSet<>(lab1);
        either.addAll(lab2);
        Set<String> onlyFirst = new TreeSet<>(lab1);
        onlyFirst.removeAll(lab2);
        System.out.println(both + " " + either + " " + onlyFirst);
    }
}
