package combinatorpattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidatorService {
    public boolean isEmailValid(String email) {
        return email.contains("@");
    }

    public boolean isPhoneNumberValid(String phoneNumer) {
        return phoneNumer.startsWith("+91");
    }

    public boolean isAdult(LocalDate dob) {
        return Period.between(dob, LocalDate.now()).getYears() > 16;
    }

    public boolean isValid(Customer customer) {
        return isEmailValid(customer.getEmail()) &&
                isPhoneNumberValid(customer.getPhoneNumber()) &&
                isAdult(customer.getDob());
    }
}
