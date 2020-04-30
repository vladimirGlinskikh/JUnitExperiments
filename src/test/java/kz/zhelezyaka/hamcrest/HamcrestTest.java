package kz.zhelezyaka.hamcrest;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertTrue;

public class HamcrestTest {
    private List<String> values;

    @Before
    public void setUpList() {
        values = new ArrayList<>();
        values.add("x");
        values.add("y");
        values.add("z");
    }

    @Test
    public void testWithoutHamcrest() {
        assertTrue(values.contains("one")
                || values.contains("two")
                || values.contains("three"));
    }
}
