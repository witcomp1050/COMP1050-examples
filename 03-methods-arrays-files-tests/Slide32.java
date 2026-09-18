import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Slide32 {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = Files.newBufferedReader(Path.of("sessions.txt"))) {
            String first = reader.readLine();
            System.out.println("First line: " + first);
        }
    }
}
