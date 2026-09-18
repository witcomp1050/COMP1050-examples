import java.util.List;

public class Slide29 {
    public static void main(String[] args) {
        List<String> lines = List.of("30", "", "45", "  ", "0");
        for (int i = 0; i < lines.size(); i++) {
            String line = lines.get(i);
            if (line.isBlank()) continue;
            System.out.println("line " + (i + 1) + ": " + line.strip());
        }
    }
}
