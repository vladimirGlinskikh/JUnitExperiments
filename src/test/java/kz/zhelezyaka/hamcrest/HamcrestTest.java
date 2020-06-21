package kz.zhelezyaka.hamcrest;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
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

    @Ignore
    @Test
    public void testWithoutHamcrest() {
        assertTrue(values.contains("one")
                || values.contains("two")
                || values.contains("three"));
    }

    @Test
    public void testWithHamcrest() {
        assertThat(values, hasItem(anyOf(equalTo("one"), equalTo("two"),
                equalTo("three"))));
    }
}
