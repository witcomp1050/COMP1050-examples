import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Slide09 {
    public static void main(String[] args) {
        List<Session> plan = new ArrayList<>(List.of(
            new Session("Maps", 30), new Session("Generics", 45), new Session("Loops", 20)));
        Collections.sort(plan);
        System.out.println(plan.get(0).describe());
        System.out.println(plan);
    }
}

interface Describable { String describe(); }

record Session(String topic, int minutes) implements Describable, Comparable<Session> {
    @Override public String describe() { return topic + " for " + minutes + " min"; }
    @Override public int compareTo(Session other) {
        return Integer.compare(minutes, other.minutes);
    }
}
