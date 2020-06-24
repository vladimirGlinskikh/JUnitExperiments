package migrating.differences;

import core.tags.Customer;
import org.junit.Test;
import org.junit.experimental.categories.Category;

import static org.junit.Assert.assertEquals;

public class JUnit4CustomerTest {
    private String CUSTOMER_NAME = "Vladimir Glinskikh";

    @Category(IndividualTests.class)
    @Test
    public void testCustomer() {
        Customer customer = new Customer(CUSTOMER_NAME);
        assertEquals("Vladimir Glinskikh", customer.getName());
    }
}
