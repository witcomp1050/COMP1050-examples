public class Slide43 {
    record Pair(String name, int[] scores) { }
    public static void main(String[] args) {
        int[] scores = {90, 80};
        Pair p = new Pair("Ada", scores);
        scores[0] = 0;
        System.out.println(p.scores()[0]);
    }
}
