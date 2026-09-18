public class Slide35 {
    public static void main(String[] args) {
        int score = 85;
        String letter;
        
        if (score >= 90) {
            letter = "A";
        } else if (score >= 80) {
            letter = "B";
        } else if (score >= 70) {
            letter = "C";
        } else {
            letter = "F";
        }
        System.out.println(letter);
    }
}
