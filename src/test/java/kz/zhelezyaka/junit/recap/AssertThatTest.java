package kz.zhelezyaka.junit.recap;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.core.CombinableMatcher.both;
import static org.hamcrest.core.CombinableMatcher.either;
import static org.hamcrest.core.IsCollectionContaining.hasItem;
import static org.hamcrest.core.IsCollectionContaining.hasItems;
import static org.hamcrest.core.StringContains.containsString;
import static org.hamcrest.core.StringEndsWith.endsWith;
import static org.hamcrest.core.StringStartsWith.startsWith;
import static org.junit.Assert.assertThat;

public class AssertThatTest {

    @Test
    public void verifyMatcher() {
        int age = 30;
        assertThat(age, equalTo(30));
        assertThat(age, is(30));

        assertThat(age, not(equalTo(33)));
        assertThat(age, is(not(33)));
    }

    @Test
    public void verifyMultipleValues() {
        double marks = 100.00;
        assertThat(marks, either(is(100.00)).or(is(90.9)));

        assertThat(marks, both(not(99.99)).and(not(60.00)));

        assertThat(marks, anyOf(is(100.00), is(1.00), is(55.00),
                is(88.00), is(67.8)));

        assertThat(marks, not(anyOf(is(0.00), is(200.00))));

        assertThat(marks, not(allOf(is(1.00), is(100.00), is(30.00))));
    }

    @Test
    public void verifyCollectionValues() {
        List<Double> salary = Arrays.asList(50.0, 200.0, 500.0);

        assertThat(salary, hasItem(50.00));
        assertThat(salary, hasItems(50.00, 200.00));
        assertThat(salary, not(hasItem(1.00)));
    }

    @Test
    public void verifyStrings() {
        String name = "I check and experiments with JUnit";
        assertThat(name, startsWith("I"));
        assertThat(name, endsWith("JUnit"));
        assertThat(name, containsString("experiments"));
    }
}
