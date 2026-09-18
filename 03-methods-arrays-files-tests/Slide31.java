import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class Slide31 {
    public static void main(String[] args) throws IOException {
        Path out = Path.of("summary.txt");
        List<String> report = List.of("Sessions: 3", "Total minutes: 75");
        Files.write(out, report, StandardCharsets.UTF_8);
        System.out.println(Files.readAllLines(out).size() + " lines written");
    }
}
