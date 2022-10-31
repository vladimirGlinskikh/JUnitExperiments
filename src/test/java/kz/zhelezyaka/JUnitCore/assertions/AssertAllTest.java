package kz.zhelezyaka.JUnitCore.assertions;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertAllTest {

    @Test
    @DisplayName("SUT should default to not being under current verification")
    void testSystemNotVerified() {
        SUT systemUnderTest = new SUT("This system under test");

        assertAll("By default, SUT is not under current verification",
                () -> assertEquals("This system under test",
                        systemUnderTest.getSystemName()),
                () -> assertFalse(systemUnderTest.isVerified()));
    }

    @Test
    @DisplayName("SUT should be under current verification")
    void testSystemUnderVerification() {
        SUT systemUnderTest = new SUT("This system under test");

        systemUnderTest.verify();

        assertAll("SUT under current verification",
                () -> assertEquals("This system under test",
                        systemUnderTest.getSystemName()),
                () -> assertTrue(systemUnderTest.isVerified()));
    }
}
