import java.util.ArrayList;
import java.util.List;

public class Slide18 {
    @SuppressWarnings({"rawtypes", "unchecked"})
    public static void main(String[] args) {
        List raw = new ArrayList();
        raw.add("Ada");
        raw.add(42);
        String first = (String) raw.get(0);
        System.out.println(first);
        String second = (String) raw.get(1);
        System.out.println(second);
    }
}
