package kz.zhelezyaka.junit.money;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class JUnit5ExceptionTester {
    private Calculator calculator = new Calculator();

    @Test
    public void expectArithmeticException(){
        assertThrows(ArithmeticException.class,
                () -> calculator.divide(6.0, 0.0));
    }

    @Test
    public void expectIllegalArgumentException(){
        assertThrows(IllegalArgumentException.class,
                () -> calculator.sqrt(-1));
    }
}
