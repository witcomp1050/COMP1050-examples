import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Slide13 {
    static void printAll(List<String> items) {
        for (String item : items) System.out.println(item);
    }
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Ada");
        names.add("Grace");
        printAll(names);
        names = new LinkedList<>(names);
        printAll(names);
    }
}
