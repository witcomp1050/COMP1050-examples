import java.util.ArrayList;
import java.util.List;

public class Slide16 {
    public static void main(String[] args) {
        List<Integer> minutes = new ArrayList<>(List.of(20, 35, 15, 40));
        for (Integer m : minutes) {
            if (m < 30) {
                minutes.remove(m);
            }
        }
        System.out.println(minutes);
    }
}
