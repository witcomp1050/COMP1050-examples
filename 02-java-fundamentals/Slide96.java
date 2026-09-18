import java.util.Scanner;

public class Slide96 {
    static int readSessions(Scanner in, int[] into) {
        int n = 0;
        while (n < into.length) {
            String line = in.nextLine().trim();
            if (line.equalsIgnoreCase("done")) {
                break;
            }
            if (line.isEmpty()) {
                continue;
            }
            if (!line.matches("\\d+") || Integer.parseInt(line) > 1440) {
                System.out.println("Ignored \"" + line + "\": use a whole number from 0 to 1440.");
                continue;
            }
            into[n] = Integer.parseInt(line);
            n++;
        }
        return n;
    }

    static int total(int[] v, int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += v[i];
        }
        return sum;
    }

    static int longest(int[] v, int n) {
        int best = v[0];
        for (int i = 1; i < n; i++) {
            if (v[i] > best) {
                best = v[i];
            }
        }
        return best;
    }

    static int countAtLeast(int[] v, int n, int threshold) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] >= threshold) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] sessions = new int[10];
        System.out.println("Enter minutes per session; type done to finish.");
        int n = readSessions(in, sessions);

        if (n == 0) {
            System.out.println("No sessions recorded.");
            return;
        }
        System.out.println("Sessions: " + n);
        System.out.println("Total minutes: " + total(sessions, n));
        System.out.printf("Average minutes: %.1f%n", (double) total(sessions, n) / n);
        System.out.println("Longest: " + longest(sessions, n));
        System.out.println("At least 30 min: " + countAtLeast(sessions, n, 30));
    }
}
