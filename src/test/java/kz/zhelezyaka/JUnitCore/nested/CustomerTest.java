package kz.zhelezyaka.JUnitCore.nested;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class CustomerTest {
    private static final String FIRST_NAME = "Vladimir";
    private static final String LAST_NAME = "Glinskikh";

    @Nested
    class BuilderTest {
        private String MIDDLE_NAME = "Vasilevich";

        @Test
        void customerBuilder() throws ParseException {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
            Date customerDate = simpleDateFormat.parse("08-15-2022");

            Customer customer = new Customer.Builder(Gender.MALE, FIRST_NAME, LAST_NAME)
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

    @Nested
    class CustomerEqualsTest {
        private String OTHER_FIRST_NAME = "Nikolay";
        private String OTHER_LAST_NAME = "Romanov";

        @Test
        void differentCustomersTest() {
            Customer customer = new Customer.Builder(Gender.MALE, FIRST_NAME, LAST_NAME)
                    .build();
            Customer otherCustomer = new Customer.Builder(Gender.MALE, OTHER_FIRST_NAME, OTHER_LAST_NAME)
                    .build();

            assertNotEquals(customer, otherCustomer);
        }

        @Test
        void sameCustomerTest() {
            Customer customer = new Customer.Builder(Gender.MALE, FIRST_NAME, LAST_NAME)
                    .build();
            Customer otherCustomer = new Customer.Builder(Gender.MALE, FIRST_NAME, LAST_NAME)
                    .build();

            assertAll(() -> {
                assertEquals(customer, otherCustomer);
                assertNotSame(customer, otherCustomer);
            });
        }
    }

    @Nested
    class CustomerHashCodeTest {
        private String OTHER_FIRST_NAME = "Nikolay";
        private String OTHER_LAST_NAME = "Romanov";

        @Test
        void differentCustomersTest() {
            Customer customer = new Customer.Builder(Gender.MALE, FIRST_NAME, LAST_NAME)
                    .build();
            Customer otherCustomer = new Customer.Builder(Gender.MALE, OTHER_FIRST_NAME, OTHER_LAST_NAME)
                    .build();

            assertNotEquals(customer.hashCode(), otherCustomer.hashCode());
        }

        @Test
        void sameCustomersTest() {
            Customer customer = new Customer.Builder(Gender.MALE, FIRST_NAME, LAST_NAME)
                    .build();
            Customer otherCustomer = new Customer.Builder(Gender.MALE, FIRST_NAME, LAST_NAME)
                    .build();

            assertEquals(customer.hashCode(), otherCustomer.hashCode());
        }
    }
}