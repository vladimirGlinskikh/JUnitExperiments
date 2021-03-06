package kz.zhelezyaka.junit.recap;

import org.junit.*;

public class SanityTest {
    @BeforeClass
    public static void beforeClass() {
        System.out.println("***Before Class is invoked");
    }

    @Before
    public void before() {
        System.out.println("______________________");
        System.out.println("\t Before is invoked");
    }

    @After
    public void after() {
        System.out.println("\t After is invoked");
        System.out.println("=====================");
    }

    @Test
    public void someTest2() {
        System.out.println("\t\t someTest2 is invoked");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("***After Class is invoked");
    }
}
