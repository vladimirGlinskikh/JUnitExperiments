package kz.zhelezyaka.junit.fail;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class FailExample {

    @Test
    public void testSizeAfterAddOne() {
        List<String> list = new ArrayList<>();
        list.add("One");
        if (list.size() != 1) {
            throw new AssertionError();
        }
    }

    @Test
    public void testSizeAfterAddTwo() {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        if (list.size() != 2) {
            throw new AssertionError();
        }
    }

    @Test
    public void testGetTheSame() {
        List<String> list = new ArrayList<>();
        list.add("A");
        if (!list.get(0).equals("A")) {
            throw new AssertionError();
        }
    }
}
