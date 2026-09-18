import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Slide26 {
    public static void main(String[] args) throws IOException {
        Path file = Path.of("sessions.txt");
        List<String> lines = Files.readAllLines(file, StandardCharsets.UTF_8);
        System.out.println(lines.size() + " lines");
        for (String line : lines) {
            System.out.println("[" + line + "]");
        }
    }
}
