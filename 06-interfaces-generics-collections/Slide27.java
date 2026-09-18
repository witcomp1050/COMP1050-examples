import java.util.HashSet;
import java.util.Set;

public class Slide27 {
    public static void main(String[] args) {
        Set<String> ids = new HashSet<>();
        System.out.println(ids.add("R1"));
        System.out.println(ids.add("R1"));
        ids.add("R2");
        System.out.println(ids.size());
        System.out.println(ids.contains("R2"));
    }
}
