import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Slide15 {
    public static void main(String[] args) {
        Map<String, List<String>> loansByStudent = new TreeMap<>();
        String[][] loans = {{"W1", "L-1"}, {"W2", "C-7"}, {"W1", "P-3"}};
        for (String[] loan : loans) {
            loansByStudent.computeIfAbsent(loan[0], k -> new ArrayList<>()).add(loan[1]);
        }
        System.out.println(loansByStudent);
        System.out.println(loansByStudent.get("W1").size());
    }
}
