package kz.zhelezyaka.junit.collection;

import org.junit.Test;

import java.util.ArrayList;

public class MyArrayListTest {
    @Test
    public void testEmptySize() {
        if (new ArrayList<String>().size() != 0) {
            throw new AssertionError();
        }
    }

    @Test
    public void testEmptyOne() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }

    @Test
    public void testEmptyAddRemoveSame() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.remove("A");
        if (list.size() != 0) {
            throw new AssertionError();
        }
    }

    @Test
    public void testEmptyAddRemoveOther() {
        ArrayList<String> list = new ArrayList<>();
        list.add("A");
        list.remove("B");
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }

    @Test
    public void testEmptyAddNull() {
        ArrayList<String> list = new ArrayList<>();
        list.add(null);
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }
}
