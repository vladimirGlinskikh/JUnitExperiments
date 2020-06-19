package core.displayNameAnnotation;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

@DisplayName("Test class showing the @DisplayName annotation.")
public class DisplayNameTest {
    private SUT systemUnderTest = new SUT();

    @Test
    @DisplayName("Our system under test says hello.")
    public void testHello() {
        assertEquals("Hello!", systemUnderTest.hello());
    }

    @Test
    @DisplayName("😱")
    public void testTalking() {
        assertEquals("How are you?", systemUnderTest.talk());
    }

    @Test
    public void testBye() {
        assertEquals("Bye!", systemUnderTest.bye());
    }
}
