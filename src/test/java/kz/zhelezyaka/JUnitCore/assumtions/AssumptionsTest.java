package kz.zhelezyaka.JUnitCore.assumtions;

import kz.zhelezyaka.JUnitCore.assumptions.Job;
import kz.zhelezyaka.JUnitCore.assumptions.SUT;
import kz.zhelezyaka.JUnitCore.assumptions.environment.JavaSpecification;
import kz.zhelezyaka.JUnitCore.assumptions.environment.OperationSystem;
import kz.zhelezyaka.JUnitCore.assumptions.environment.TestEnvironment;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class AssumptionsTest {
    private static String EXPECTED_JAVA_VERSION = "1.8";
    private TestEnvironment environment = new TestEnvironment(
            new JavaSpecification(System.getProperty("java.vm.specification.version")),
            new OperationSystem(System.getProperty("os.name"), System.getProperty("os.arch")));

    private SUT systemUnderTest = new SUT();

    @BeforeEach
    void setUp() {
        assumeTrue(environment.isWindows());
    }

    @Test
    void testNoJobRun() {
        assumingThat(
                () -> environment.getJavaVersion().equals(EXPECTED_JAVA_VERSION),
                () -> assertFalse(systemUnderTest.hasJobToRun()));
    }

    @Test
    void testJobRun() {
        assumeTrue(environment.isAmd64Architecture());

        systemUnderTest.run(new Job());

        assertTrue(systemUnderTest.hasJobToRun());
    }
}
