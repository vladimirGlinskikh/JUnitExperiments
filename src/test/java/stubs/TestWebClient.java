package stubs;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mortbay.jetty.Server;
import org.mortbay.jetty.servlet.Context;

import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWebClient {

    @BeforeAll
    public static void setUp() throws Exception {
        Server server = new Server(8080);
        Context contextOKContext = new Context(server, "/testGetContentOK");
        contextOKContext.setHandler(new TestGetContentOKHandler());

        server.setStopAtShutdown(true);
        server.start();
    }

    @AfterAll
    public static void tearDown() {

    }

    @Test
    public void testGetContentOK() throws Exception {
        WebClient client = new WebClient();
        String workingContent = client.getContent(new URL(
                "http://localhost:8080/testGetContentOK"
        ));
        assertEquals("It works", workingContent);
    }
}
