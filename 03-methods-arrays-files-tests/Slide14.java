import java.util.Arrays;

public class Slide14 {
    public static void main(String[] args) {
        int[] minutes = {20, 35, 15};
        int[] bigger = Arrays.copyOf(minutes, 5);
        bigger[3] = 40;
        System.out.println(Arrays.toString(minutes));
        System.out.println(Arrays.toString(bigger));
    }
}
