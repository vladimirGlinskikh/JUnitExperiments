package core.tags;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Tag("repository")
public class CustomerRepositoryTest {
    private String CUSTOMER_NAME = "Vladimir Glinskikh";
    private CustomerRepository repository = new CustomerRepository();

    @Test
    public void testNonExistence() {
        boolean exists = repository.contains("Vladimir Glinskikh");
        assertFalse(exists);
    }

    @Test
    public void testCustomerPersistence() {
        repository.persist(new Customer(CUSTOMER_NAME));
        assertTrue(repository.contains("Vladimir Glinskikh"));
    }
}
