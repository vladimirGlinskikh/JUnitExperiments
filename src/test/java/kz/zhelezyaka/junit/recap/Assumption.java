package kz.zhelezyaka.junit.recap;

import org.junit.Assume;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class Assumption {
    boolean isSonarRunning = false;

    @Test
    public void veryCriticalTest() throws Exception{
        //isSonarRunning = true;
        isSonarRunning = false;
        Assume.assumeFalse(isSonarRunning);
        assertTrue(true);
    }
}
