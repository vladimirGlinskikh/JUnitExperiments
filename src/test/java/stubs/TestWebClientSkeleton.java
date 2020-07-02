package stubs;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestWebClientSkeleton {
    @BeforeAll
    public static void setUp() {

    }

    @AfterAll
    public static void tearDown() {

    }

    @Test
    public void testGetContentOK() throws MalformedURLException {
        WebClient client = new WebClient();
        String workingContent = client.getContent(new URL(
                "http://localhost:8080/testGetContentOK"
        ));
        assertEquals("It works", workingContent);
    }
}
