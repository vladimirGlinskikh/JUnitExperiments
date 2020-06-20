package core.nestedTests;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class NestedTestsTest {
    private static final String FIRST_NAME = "Vladimir";
    private static final String LAST_NAME = "Glinskikh";

    @Nested
    class BuilderTest {
        private String MIDDLE_NAME = "Vasiliy";

        @Test
        public void customerBuilder() throws ParseException {
            SimpleDateFormat simpleDateFormat =
                    new SimpleDateFormat("MM-dd-yyyy");
            Date customerDate = simpleDateFormat.parse("08-15-2019");

            Customer customer = new Customer.Builder(
                    Gender.MALE, FIRST_NAME, LAST_NAME)
                    .withMiddleName(MIDDLE_NAME)
                    .withBecomeCustomer(customerDate)
                    .build();

            assertAll(() -> {
                assertEquals(Gender.MALE, customer.getGender());
                assertEquals(FIRST_NAME, customer.getFirstName());
                assertEquals(LAST_NAME, customer.getLastName());
                assertEquals(MIDDLE_NAME, customer.getMiddleName());
                assertEquals(customerDate, customer.getBecomeCustomer());
            });
        }
    }
}
