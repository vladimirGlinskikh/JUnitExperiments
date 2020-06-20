package core.displayNameAnnotation;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class DisabledMethodsTest {
    private SUT systemUnderTest =
            new SUT("Our system under test");

    @Test
    @Disabled
    public void testRegularWork() {
        boolean canReceiveRegularWork =
                systemUnderTest.canReceiveRegularWork();
        assertFalse(canReceiveRegularWork);
    }

    @Test
    @Disabled("Method still under construction.")
    public void testAdditionalWork() {
        boolean canReceiveAdditionalWork =
                systemUnderTest.canReceiveAdditionalWork();
        assertTrue(canReceiveAdditionalWork);
    }
}
