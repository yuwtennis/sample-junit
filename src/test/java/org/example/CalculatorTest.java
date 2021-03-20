package org.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {
    private Calculator c = new Calculator();

    /* Simple Assert Testing */
    @Test
    public void AdditonTest() {
        assertEquals(2, c.Addition(1,1));
    }
    @Test
    public void SubtractionTest() {
        assertEquals(1, c.Subtration(2,1));
    }
    @Test
    public void MultiplicationTest() {
        assertEquals(2, c.Multiplication(2,1));
    }
    @Test
    public void DivisionTest() {
        assertEquals(2, c.Division(2,1));
        assertEquals(0 , c.Division(0, 1));
    }

    /* Exception Testing */
    @Test(expected = ArithmeticException.class)
    public void ZeroDivisionTest() {
        c.Division(1, 0)  ;
    }

}
