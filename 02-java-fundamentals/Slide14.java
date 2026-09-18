public class Slide14 {
    public static void main(String[] args) {
        int a = 7;
        int b = 2;
        double average = a / b;
        System.out.println(average);
        average = (double) a / b;
        System.out.println(average);
        
        double price = 3.99;
        int dollars = (int) price;
        System.out.println(dollars);
        System.out.println(Math.round(price));
    }
}
