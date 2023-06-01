package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static combinatorpattern.CustomerRegistrationValidation.*;
import static combinatorpattern.CustomerRegistrationValidation.ValidationResult.*;

public interface CustomerRegistrationValidation extends Function<Customer, ValidationResult> {

    static CustomerRegistrationValidation isEmailValid() {
        System.out.println("email");
        return customer -> customer.getEmail().contains("@") ?
                SUCCESS : EMAIL_NOT_VALID;
    }

    static CustomerRegistrationValidation isPhoneNumberValid() {
        System.out.println("phone");
        return customer -> customer.getPhoneNumber().startsWith("+91") ?
                SUCCESS : PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegistrationValidation isAdult() {
        System.out.println("adult");
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
                SUCCESS : ValidationResult.IS_NOT_AN_ADULT;
    }

    default CustomerRegistrationValidation and(CustomerRegistrationValidation other) {
        System.out.println("and");
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
