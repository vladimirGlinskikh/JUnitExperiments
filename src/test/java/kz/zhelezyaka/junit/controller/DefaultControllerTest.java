package kz.zhelezyaka.junit.controller;

import org.junit.Before;
import org.junit.Test;

public class DefaultControllerTest {
    private DefaultController controller;

    @Before
    public void instantiate() throws Exception {
        controller = new DefaultController();
    }

    @Test
    public void testMethod() {
        throw new RuntimeException("implement me!");
    }
}
