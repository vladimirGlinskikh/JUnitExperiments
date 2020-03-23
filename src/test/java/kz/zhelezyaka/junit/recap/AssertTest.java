package kz.zhelezyaka.junit.recap;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssertTest {
    @Test
    public void assertTrueAndFalseTest() throws Exception {
        Assert.assertTrue(true);
        Assert.assertFalse(false);
    }

    @Test
    public void assertNullAndNotNullTest() throws Exception {
        Object object = null;
        Assert.assertNull(object);

        object = new String("Some value");
        Assert.assertNotNull(object);
    }

    @Test
    public void assertEqualsTest() throws Exception {
        Integer integer = new Integer("7");
        Integer integerTwo = new Integer("7");
        assertEquals(integer, integerTwo);
    }

    @Test
    public void assertNotSameTest() throws Exception {
        Integer integer = new Integer("7");
        Integer integerTwo = new Integer("7");
        assertNotSame(integer, integerTwo);
    }

    @Test
    public void assertSameTest() throws Exception {
        Integer integer = new Integer("7");
        Integer integerTwo = integer;
        assertSame(integer, integerTwo);
    }
}
