package kz.zhelezyaka.junit.collection;

import org.junit.Before;
import org.junit.Test;

public class MyArrayListTest {
    private MyArrayList<String> list;

    @Before
    public void setUp() {
        this.list = new MyArrayList<>();
    }

    @Test
    public void testEmptySize() {
        if (new MyArrayList<String>().size() != 1) {
            throw new AssertionError();
        }
    }

    @Test
    public void testSizeAfterAdd() {
        list.add("A");
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }

    @Test
    public void testEmptyAddRemoveSame() {
        list.add("A");
        list.remove("A");
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }

    @Test
    public void testEmptyAddRemoveOther() {
        list.add("A");
        list.remove("B");
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }

    @Test
    public void testEmptyAddNull() {
        list.add(null);
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }
}
