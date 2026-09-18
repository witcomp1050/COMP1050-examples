public class Slide35 {
    static void change(int value) {
        value = 99;
    }
    public static void main(String[] args) {
        int score = 10;
        change(score);
        System.out.println(score);
    }
}
