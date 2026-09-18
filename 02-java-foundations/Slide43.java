import java.util.Arrays;

public class Slide43 {
    public static void main(String[] args) {
        int[] minutes = {20, 35, 15, 40};
        System.out.println(Arrays.toString(minutes));
        Arrays.sort(minutes);
        System.out.println(Arrays.toString(minutes));
        System.out.println(minutes.length);
    }
}
