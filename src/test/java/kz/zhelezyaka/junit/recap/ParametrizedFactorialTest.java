package kz.zhelezyaka.junit.recap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class ParametrizedFactorialTest {
    private int number;
    private int expectedResult;

    public ParametrizedFactorialTest(int input, int expected) {
        number = input;
        expectedResult = expected;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> factorialData() {
        return Arrays.asList(new Object[][]{
                {0, 1}, {1, 1}, {2, 2}, {3, 6},
                {4, 24}, {5, 120}, {6, 720}
        });
    }

    @Test
    public void factorial() {
        Factorial factorial = new Factorial();
        assertEquals(factorial.factorial(number), expectedResult);
    }
}
