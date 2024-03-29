package kz.zhelezyaka.JUnitCore.arrays;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

class PositiveNumbersTest {

    @Test
    void getPositiveSortedNumbers() {
        var expected = PositiveNumbers
                .getPositiveSortedNumbers(new int[]{-2, 1, 2, 12, 0, -2, 4});

        var actual = new int[] {0, 1, 2, 4, 12};

        assertThat(expected, is(actual));
    }
}
