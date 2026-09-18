public class Slide16 {
    public static void main(String[] args) {
        final double TAX_RATE = 0.0625;
        final int MAX_MINUTES = 1440;
        
        double subtotal = 40.00;
        double total = subtotal + subtotal * TAX_RATE;
        System.out.println(total);
        System.out.println(MAX_MINUTES > 0);
    }
}
