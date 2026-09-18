import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Slide29 {
    public static void main(String[] args) {
        List<Integer> minutes = new ArrayList<>(List.of(20, 35, 15, 40));
        Iterator<Integer> it = minutes.iterator();
        while (it.hasNext()) {
            if (it.next() < 30) it.remove();
        }
        System.out.println(minutes);
    }
}
