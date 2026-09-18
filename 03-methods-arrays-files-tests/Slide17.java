import java.util.List;

public class Slide17 {
    public static void main(String[] args) {
        List<Integer> minutes = List.of(20, 35, 15);
        long total = 0;
        for (int m : minutes) total += m;
        System.out.println(total);
        System.out.println(minutes.isEmpty());
    }
}
