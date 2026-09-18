public class Slide63 {
    static void addBonus(int minutes) {
        minutes += 10;
        System.out.println("inside: " + minutes);
    }
    public static void main(String[] args) {
        int session = 30;
        addBonus(session);
        System.out.println("after: " + session);
    }
}
