package migrating.differences;

import org.junit.*;

import static org.junit.Assert.*;

public class JUnit4SUTTest {
    public static ResourceForAllTests resourceForAllTests;
    private SUT systemUnderTest;

    @BeforeClass
    public static void setUpClass() {
        resourceForAllTests =
                new ResourceForAllTests("Our resource for all tests");
    }

    @AfterClass
    public static void tearDownClass() {
        resourceForAllTests.close();
    }

    @Before
    public void setUp() {
        systemUnderTest = new SUT("Our system under  test");
    }

    @After
    public void tearDown() {
        systemUnderTest.close();
    }

    @Test
    public void testUsualWork() {
        boolean canReceiveUsualWork = systemUnderTest.canReceiveUsualWork();
        assertTrue(canReceiveUsualWork);
    }

    @Test
    public void testAdditionalWork() {
        boolean canReceiveAdditionalWork =
                systemUnderTest.canReceiveAdditionalWork();
        assertFalse(canReceiveAdditionalWork);
    }

    @Test
    @Ignore
    public void mySecondTest(){
        assertEquals("2 is not equal to 1", 2, 1);
    }
}
