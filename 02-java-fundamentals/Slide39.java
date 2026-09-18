public class Slide39 {
    public static void main(String[] args) {
        String text = "";
        
        if (text.length() > 0 && text.charAt(0) == '-') {
            System.out.println("negative");
        } else {
            System.out.println("not negative");
        }
        
        int count = 0;
        int total = 100;
        if (count != 0 && total / count > 10) {
            System.out.println("big average");
        } else {
            System.out.println("no sessions yet");
        }
    }
}
