package kz.zhelezyaka.junit.recap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

import static org.hamcrest.CoreMatchers.equalTo;

public class ErrorCollectorTest {

    @Rule
    public ErrorCollector collector = new ErrorCollector();

    @Test
    public void failsAfterExecution() {
        collector.checkThat("a", equalTo("b"));
        collector.checkThat(1, equalTo(2));
        collector.checkThat("ae", equalTo("g"));
    }
}
