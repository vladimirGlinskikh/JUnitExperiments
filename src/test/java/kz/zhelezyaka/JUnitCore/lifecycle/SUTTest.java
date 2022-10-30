package kz.zhelezyaka.JUnitCore.lifecycle;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

//@Disabled("Feature is still under construction.")
class SUTTest {
    private static ResourceForAllTests resourceForAllTests;
    private SUT systemUnderTest;

    @BeforeAll
    static void setUpClass() {
        resourceForAllTests =
                new ResourceForAllTests("This resource for all tests.");
    }

    @AfterAll
    static void tearDownClass() {
        resourceForAllTests.close();
    }

    @BeforeEach
    void setUp() {
        systemUnderTest = new SUT("This system under test.");
    }

    @AfterEach
    void tearDown() {
        systemUnderTest.close();
    }

    @Test
//    @Disabled("This method is still under construction")
    void canReceiveRegularWork() {
        boolean canReceiveRegularWork =
                systemUnderTest.canReceiveRegularWork();
        assertTrue(canReceiveRegularWork);
    }

    @Test
    void canReceiveAdditionalWork() {
        boolean canReceiveAdditionalWork =
                systemUnderTest.canReceiveAdditionalWork();
        assertFalse(canReceiveAdditionalWork);
    }
}