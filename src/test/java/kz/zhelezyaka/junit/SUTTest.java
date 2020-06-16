package kz.zhelezyaka.junit;

import org.junit.jupiter.api.*;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class SUTTest {
    private static ResourceForAllTests resourceForAllTests;
    private SUT systemUnderTests;

    @BeforeAll
    static void setUpClass() {
        resourceForAllTests =
                new ResourceForAllTests("Our resource for all tests");
    }

    @AfterAll
    static void tearDownClass() {
        resourceForAllTests.close();
    }

    @BeforeEach
    void setUp() {
        systemUnderTests = new SUT("Our system under test");
    }

    @AfterEach
    void tearDown() {
        systemUnderTests.close();
    }

    @Test
    void testRegularWork() {
        boolean canReceiveRegularWork =
                systemUnderTests.canReceiveRegularWork();
        assertTrue(canReceiveRegularWork);
    }

    @Test
    void testAdditionalWork() {
        boolean canReceiveAdditionalWork =
                systemUnderTests.canReceiveAdditionalWork();
        assertFalse(canReceiveAdditionalWork);
    }
}
