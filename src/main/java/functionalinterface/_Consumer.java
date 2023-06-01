package functionalinterface;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {

        Customer maria = new Customer("Maria", "99999");

        // Normal Function
        greetCustomer(maria);

        // Consumer - accept one argument and return nothing. Used for doing operation with single input.
        greetCustomerConsumer.accept(maria);

        // BiConsumer - accept two argument and return nothing. Used for doing operation with two input.
        greetCustomerBiConsumer.accept(maria, false);
    }

    static Consumer<Customer> greetCustomerConsumer = customer -> {
        System.out.println("Hello " + customer.customerName + ", thanks for registering " + customer.customerPhoneNumber);
    };

    static BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhNum) -> {
        System.out.println("Hello " + customer.customerName + ", thanks for registering "
                + (showPhNum ? customer.customerPhoneNumber : "******"));
    };

    static void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.customerName + ", thanks for registering " + customer.customerPhoneNumber);
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }
}
