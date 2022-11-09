package kz.zhelezyaka.JUnitCore.stubs;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mortbay.jetty.Handler;
import org.mortbay.jetty.HttpHeaders;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.handler.AbstractHandler;
import org.mortbay.jetty.servlet.Context;
import org.mortbay.util.ByteArrayISO8859Writer;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;


class WebClientTest {
    private WebClient client = new WebClient();

    @BeforeAll
    public static void setUp() throws Exception {
        Server server = new Server(8081);

        Context contentOkContext = new Context(server, "/testGetContentOk");
        contentOkContext.setHandler(new TestGetContentOkHandler());

        Context contentErrorContext = new Context(server, "/testGetContentError");
        contentErrorContext.setHandler(new TestGetContentServerErrorHandler());

        Context contentNotFoundContext = new Context(server, "/testGetContentNotFound");
        contentNotFoundContext.setHandler(new TestGetContentNotFoundHandler());

        server.setStopAtShutdown(true);
        server.start();
    }

    @AfterAll
    public static void tearDown() {
    }

    @Test
    void getContentOkTest() throws MalformedURLException {
        String workingContent = client.getContent(new URL("http://localhost:8081/testGetContentOk"));
        assertEquals("This case it works", workingContent);
    }

    private static class TestGetContentOkHandler extends AbstractHandler {
        @Override
        public void handle(
                String target,
                HttpServletRequest request,
                HttpServletResponse response,
                int dispatch) throws IOException {
            OutputStream outputStream = response.getOutputStream();
            ByteArrayISO8859Writer writer = new ByteArrayISO8859Writer();
            writer.write("This case it works");
            writer.flush();
            response.setIntHeader(HttpHeaders.CONTENT_LENGTH, writer.size());
            writer.writeTo(outputStream);
            outputStream.flush();
        }
    }

    private static class TestGetContentServerErrorHandler extends AbstractHandler {
        @Override
        public void handle(
                String target,
                HttpServletRequest request,
                HttpServletResponse response,
                int dispatch) throws IOException {
            response.sendError(HttpServletResponse.SC_SERVICE_UNAVAILABLE);
        }
    }

    private static class TestGetContentNotFoundHandler extends AbstractHandler {
        @Override
        public void handle(
                String target,
                HttpServletRequest request,
                HttpServletResponse response,
                int dispatch) throws IOException {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);
        }
    }
}