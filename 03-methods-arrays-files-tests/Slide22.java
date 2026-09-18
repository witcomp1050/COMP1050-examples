public class Slide22 {
    static int parseMinutes(String text, int lineNumber) throws InvalidSessionException {
        int value;
        try {
            value = Integer.parseInt(text.strip());
        } catch (NumberFormatException e) {
            throw new InvalidSessionException(lineNumber, "line " + lineNumber + ": not a whole number");
        }
        if (value < 0) {
            throw new InvalidSessionException(lineNumber, "line " + lineNumber + ": " + value + " is negative");
        }
        return value;
    }
    public static void main(String[] args) {
        try {
            parseMinutes("-5", 4);
        } catch (InvalidSessionException e) {
            System.out.println(e.getLineNumber() + " | " + e.getMessage());
        }
    }
}

class InvalidSessionException extends Exception {
    private final int lineNumber;

    InvalidSessionException(int lineNumber, String message) {
        super(message);
        this.lineNumber = lineNumber;
    }

    int getLineNumber() { return lineNumber; }
}
