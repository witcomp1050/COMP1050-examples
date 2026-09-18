import java.util.LinkedList;
import java.util.List;

public class Slide09 {
    public static void main(String[] args) {
        List<String> chain = new LinkedList<>(List.of("R1", "R2", "R3"));
        chain.add(0, "R0");
        System.out.println(chain);
        System.out.println(chain.get(2));
    }
}
