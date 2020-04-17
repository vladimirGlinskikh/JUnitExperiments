package kz.zhelezyaka.junit.controller;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertSame;

public class DefaultControllerTest {
    private DefaultController controller;

    private class SampleRequest implements Request {

        @Override
        public String getName() {
            return "Test";
        }
    }

    private class SampleHandler implements RequestHandler {

        @Override
        public Response process(Request request) throws Exception {
            return new SampleResponse();
        }
    }

    private class SampleResponse implements Response {

    }

    @Before
    public void instantiate() throws Exception {
        controller = new DefaultController();
    }

    @Test
    public void testMethod() {
        throw new RuntimeException("implement me!");
    }

    @Test
    public void testAddHandler() {
        Request request = new SampleRequest();
        RequestHandler handler = new SampleHandler();
        controller.addHandler(request, handler);
        RequestHandler handler2 = controller.getHandler(request);
        assertSame("Handler we set in controller should be the " +
                "same handler we get", handler2, handler);
    }
}
