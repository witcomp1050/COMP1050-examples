public class Slide27 {
    public static void main(String[] args) {
        Loan loan = new Loan("L-1");
        loan.returnItem();
        System.out.println("active: " + loan.isActive());
        try {
            loan.returnItem();
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Loan {
    private final String id;
    private boolean active = true;
    Loan(String id) { this.id = id; }
    boolean isActive() { return active; }
    void returnItem() {
        if (!active) {
            throw new IllegalStateException(id + " was already returned");
        }
        active = false;
    }
}
