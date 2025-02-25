import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MathOpTest {
    MathOp mathOperations = new MathOp();

    @Test
    void testSafeDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> mathOperations.safeDivide(8, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }

    @Test
    void testSafeDivideValid() {
        assertEquals(2.5, mathOperations.safeDivide(5, 2));
    }
}
