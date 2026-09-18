import java.util.PriorityQueue;

public class Slide29 {
    record Ticket(String id, int urgency) implements Comparable<Ticket> {
        public int compareTo(Ticket o) { return Integer.compare(urgency, o.urgency); }
    }
    public static void main(String[] args) {
        PriorityQueue<Ticket> desk = new PriorityQueue<>();
        desk.add(new Ticket("R1", 3));
        desk.add(new Ticket("R2", 1));
        desk.add(new Ticket("R3", 2));
        System.out.println(desk.poll().id());
        System.out.println(desk.poll().id());
    }
}
