package kz.zhelezyaka.junit.collection;

import org.junit.Test;

public class MyArrayListTest {
    @Test
    public void testEmptySize() {
        if (new MyArrayList<String>().size() != 0) {
            throw new AssertionError();
        }
    }

    @Test
    public void testSizeAfterAdd() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A");
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }

    @Test
    public void testEmptyAddRemoveSame() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A");
        list.remove("A");
        if (list.size() != 0) {
            throw new AssertionError();
        }
    }

    @Test
    public void testEmptyAddRemoveOther() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add("A");
        list.remove("B");
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }

    @Test
    public void testEmptyAddNull() {
        MyArrayList<String> list = new MyArrayList<>();
        list.add(null);
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }
}
