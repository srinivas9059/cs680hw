package umbcs680.hw1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testMultiply() {
        Calculator calc = new Calculator();
        assertEquals(6.0, calc.multiply(2, 3), "Expected product to be 6.0");
    }

    @Test
    public void testDivide() {
        Calculator calc = new Calculator();
        assertEquals(5.0, calc.divide(10, 2), "Expected quotient to be 5.0");
    }

    @Test
    public void testDivideByZero() {
        Calculator calc = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calc.divide(10, 0), "Expected IllegalArgumentException for division by zero");
    }
}
