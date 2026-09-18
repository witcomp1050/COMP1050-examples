import java.util.ArrayList;
import java.util.List;

public class Slide08 {
    public static void main(String[] args) {
        List<Integer> minutes = new ArrayList<>(List.of(10, 1, 5));
        minutes.remove(1);
        System.out.println(minutes);
        minutes.remove(Integer.valueOf(5));
        System.out.println(minutes);
    }
}
