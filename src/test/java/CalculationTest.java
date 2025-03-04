import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculationTest {

    Operations calc = new Operations();
    @Test
    void addition() {
        assertEquals(10, Operations.addition(5, 5));

    }

    @Test
    void substraction() {
        assertEquals(0, Operations.subtraction(5, 5));

    }

    @Test
    void multiplication() {
        assertEquals(25, Operations.multiplication(5, 5));

    }

    @Test
    void modulo() {
        assertEquals(0, Operations.modulo(5, 5));

    }

    @Test
    void division() {
        assertEquals(10, Operations.addition(5, 5));

    }

    @Test
    void sqrt() {
        assertEquals(2, Operations.square(4));

    }

    @Test
    void log() {


    }

    @Test
    void log10() {
    }

    @Test
    void potence() {
        assertEquals(8, Operations.pow(2, 3));

    }
}