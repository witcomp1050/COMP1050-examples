import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import static org.junit.jupiter.api.Assertions.*;

class Slide41 {
    @Test void readsLines(@TempDir Path dir) throws IOException {
        Path file = dir.resolve("sessions.txt");
        Files.writeString(file, "30\n\n45\n");
        List<String> lines = SessionFileReader.readLines(file);
        assertEquals(List.of("30", "", "45"), lines);
    }
}

final class SessionFileReader {
    static List<String> readLines(Path file) throws IOException {
        return Files.readAllLines(file, StandardCharsets.UTF_8);
    }
}
