import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Slide28 {
    public static void main(String[] args) {
        try {
            List<String> lines = Files.readAllLines(Path.of("missing.txt"));
            System.out.println(lines.size());
        } catch (IOException e) {
            System.out.println("Could not read: " + e.getMessage());
        }
    }
}
