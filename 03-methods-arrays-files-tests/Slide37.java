import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Slide37 {
    @Test void briefExample() {
        SessionSummary s = SessionSummary.of(List.of(30, 45, 0));
        assertEquals(3, s.count());
        assertEquals(75L, s.totalMinutes());
        assertEquals(25.0, s.averageMinutes(), 1e-9);
    }
}

final class SessionSummary {
    private final int count;
    private final long totalMinutes;
    private SessionSummary(int count, long totalMinutes) { this.count = count; this.totalMinutes = totalMinutes; }
    static SessionSummary of(List<Integer> minutes) {
        long total = 0;
        for (int m : minutes) total += m;
        return new SessionSummary(minutes.size(), total);
    }
    int count() { return count; }
    long totalMinutes() { return totalMinutes; }
    double averageMinutes() { return (double) totalMinutes / count; }
}
