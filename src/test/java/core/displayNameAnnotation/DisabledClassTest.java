package core.displayNameAnnotation;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Disabled("Methods is still under construction.")
public class DisabledClassTest {
    private SUT systemUnderTest = new SUT("Our sistem under test");

    @Test
    public void testRegularWork() {
        boolean canReceiveRegularWork =
                systemUnderTest.canReceiveRegularWork();
        assertTrue(canReceiveRegularWork);
    }

    @Test
    public void testAdditionalWork() {
        boolean canReceiveAdditionalWork =
                systemUnderTest.canReceiveAdditionalWork();
        assertFalse(canReceiveAdditionalWork);
    }
}
