public class Slide42 {
    public static void main(String[] args) {
        int[] first = {10, 20};
        int[] second = first;
        second[0] = 99;
        System.out.println(first[0]);
        
        second = new int[] {7, 8};
        System.out.println(first[0]);
    }
}
