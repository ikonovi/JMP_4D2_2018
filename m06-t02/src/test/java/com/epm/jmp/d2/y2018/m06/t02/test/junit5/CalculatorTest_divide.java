package com.epm.jmp.d2.y2018.m06.t02.test.junit5;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import com.epm.jmp.d2.y2018.m06.t02.Calcable;
import com.epm.jmp.d2.y2018.m06.t02.Calculator;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


/**
 * Division Properties to be tested
 *
 * https://ru.wikipedia.org/wiki/%D0%94%D0%B5%D0%BB%D0%B5%D0%BD%D0%B8%D0%B5_(%D0%BC%D0%B0%D1%82%D0%B5%D0%BC%D0%B0%D1%82%D0%B8%D0%BA%D0%B0)
 *
 */
public class CalculatorTest_divide {

    private static Calcable calc;

    @BeforeAll
    public static void setUpBeforeClass() throws Exception {
        calc = new Calculator();
    }

    @Test
    public void testDivision_NonCommutativity_Double() {
        double x = 3.2;
        double y = 5.3;
        assertNotEquals(calc.divide(x, y), calc.divide(y, x));
    }

    @Test
    public void testDivision_NonAssociativity_Double() {
        double x = 2.3;
        double y = 3.5;
        double z = 7.11;
        assertNotEquals(calc.divide(calc.divide(x, y), z), calc.divide(x, calc.divide(y, z)));
    }

    @Test
    public void testDivision_Distributivity_Double() {
        double x = 2.3;
        double y = 5.7;
        double z = 11.13;
        double delta = 0.0000000000000001E+308;
        assertEquals(calc.divide(calc.sum(x, y), z), calc.sum(calc.divide(x, z), calc.divide(y, z)),
                delta);
    }

    @Test
    public void testDivision_IdentityElement_Double() { // Нейтральный элемент
        double x = 3.5;
        double delta = 0.0000000000000001E+308;
        assertEquals(x, calc.divide(x, 1), delta);
    }

    @Test
    public void testDivision_ZeroElement_Double() { // Нулевой элемент
        double y = 3.5;
        double delta = 0.0000000000000001E+308;
        assertEquals(0, calc.divide(0, y), delta);
    }

    @Test
    public void testDivision_ByZero_Double() { // Деление на ноль
        double x = 3.5;
        assertThrows(IllegalArgumentException.class, () -> {
            calc.divide(x, 0);
        }, "Cannot divide by zero");
    }

    @Test
    public void testDivision_ByInverseElement_Double() { // на противоположный элемент
        double x = 3.5;
        double delta = 0.0000000000000001E+308;
        assertEquals(-1, calc.divide(x, -x), delta);
    }
}
