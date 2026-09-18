import java.util.ArrayList;
import java.util.List;

public class Slide15 {
    public static void main(String[] args) {
        List<Integer> minutes = new ArrayList<>();
        minutes.add(20);
        minutes.add(35);
        minutes.add(15);
        System.out.println(minutes.size());
        System.out.println(minutes.get(1));
        System.out.println(minutes);
    }
}
