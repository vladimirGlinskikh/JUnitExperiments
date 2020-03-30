package kz.zhelezyaka.junit.recap;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestRule;
import org.junit.rules.Verifier;

import static org.junit.Assert.assertNull;

public class VerifierRuleTest {
    private String errorMsg = null;

    @Rule
    public TestRule rule = new Verifier() {
        @Override
        protected void verify() throws Throwable {
            assertNull("ErrorMsg should be null after each test execution", errorMsg);
        }
    };

    @Test
    public void testName() throws Exception {
        errorMsg = "Giving a value";
    }
}
