package kz.zhelezyaka.JUnitCore.assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTimeoutPreemptively;

public class AssertTimeoutTest {
    private SUT systemUnderTest = new SUT("This system under test");

    @Test
    @DisplayName("A job is executed within a timeout")
    void testTimeout() {
        systemUnderTest.addJob(new Job("Job 1"));
        assertTimeout(ofMillis(500),
                () -> systemUnderTest.run(200));
    }

    @Test
    @DisplayName("A job is executed preemptively within a timeout")
    void testTimeoutPreemptively() {
        systemUnderTest.addJob(new Job("Job 1"));
        assertTimeoutPreemptively(ofMillis(500),
                () -> systemUnderTest.run(200));
    }
}
