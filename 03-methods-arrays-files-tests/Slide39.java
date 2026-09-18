import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Slide39 {
    @Test void rejectsNegativeWithLineNumber() {
        InvalidSessionException ex = assertThrows(
            InvalidSessionException.class,
            () -> SessionParser.parseMinutes("-5", 3));
        assertEquals(3, ex.getLineNumber());
        assertTrue(ex.getMessage().contains("line 3"));
    }
}

final class SessionParser {
    static int parseMinutes(String text, int lineNumber) throws InvalidSessionException {
        int value = Integer.parseInt(text.strip());
        if (value < 0) throw new InvalidSessionException(lineNumber, "line " + lineNumber + ": " + value + " is negative");
        return value;
    }
}

class InvalidSessionException extends Exception {
    private final int lineNumber;
    InvalidSessionException(int lineNumber, String message) { super(message); this.lineNumber = lineNumber; }
    int getLineNumber() { return lineNumber; }
}
