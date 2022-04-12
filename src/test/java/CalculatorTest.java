import Calculator.Calculator;
import org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calc = new Calculator();

    @Test
    public void sqRootPositive() {
        assertEquals("Testing True Positive for squareRoot", 10.0, calc.squareRoot(100.0), DELTA);
        assertEquals("Testing for True Negative for squareRoot", Double.NaN, calc.squareRoot(-100.0), DELTA);
    }
    @Test
    public void sqRootNegative() {
        assertNotEquals("Testing False Positive for squareRoot", 6.0, calc.squareRoot(64.0), DELTA);
        assertNotEquals("Testing for False Negative for squareRoot", Double.NaN, calc.squareRoot(10), DELTA);
    }
    @Test
    public void factorialPositive() {
        assertEquals("Testing True Positive for factorial", 120.0, calc.factorial(5), DELTA);
        assertEquals("Testing for True Negative for factorial", Double.NaN, calc.factorial(-10), DELTA);
    }
    @Test
    public void factorialNegative() {
        assertNotEquals("Testing False Positive for factorial", 10.0, calc.factorial(-3), DELTA);
        assertNotEquals("Testing for False Negative for factorial", Double.NaN, calc.factorial(8), DELTA);
    }
    @Test
    public void NlogPositive() {
        assertEquals("Testing True Positive for natural log", 2.302585092994046, calc.naturalLog(10.0), DELTA);
        assertEquals("Testing for True Negative for natural log", Double.NaN, calc.naturalLog(-10.0), DELTA);
    }
    @Test
    public void NlogNegative() {
        assertNotEquals("Testing False Positive for natural log", 10.0, calc.naturalLog(-5.0), DELTA);
        assertNotEquals("Testing for False Negative for natural log", Double.NaN, calc.naturalLog(8.0), DELTA);
    }
    @Test
    public void powerPositive() {
        assertEquals("Testing True Positive for power function", 1024.0, calc.powerFunction(2.0, 10.0), DELTA);
        assertEquals("Testing for True Negative for power function", 0.5, calc.powerFunction(2.0, -1.0), DELTA);
    }
    @Test
    public void powerNegative() {
        assertNotEquals("Testing False Positive for power function", 10.0, calc.powerFunction(5.0, 2.0), DELTA);
        assertNotEquals("Testing for False Negative for power function", -25.0, calc.powerFunction(-5.0, 2.0), DELTA);
    }
}