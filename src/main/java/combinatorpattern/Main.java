package combinatorpattern;

import java.time.LocalDate;

import static combinatorpattern.CustomerRegistrationValidation.*;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer(
                "Niranjan",
                "niranjan@gmail.com",
                "+919833514118",
                LocalDate.of(1998, 9, 26)
        );

        System.out.println(new CustomerValidatorService().isValid(customer));

        // Combinator pattern
        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        System.out.println(result);

    }
}
