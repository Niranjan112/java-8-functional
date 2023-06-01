package functionalinterface;

import java.util.function.Predicate;

public class _Predicate {
    public static void main(String[] args) {
        //Normal Function
        System.out.println(isPhoneNumberValid("+91988989"));
        System.out.println(isPhoneNumberValid("+919833514229"));

        //Predicate - take one input and return boolean value;
        System.out.println(
                isPhoneNumberValidPred.test("+91988989")
        );
        System.out.println(
                isPhoneNumberValidPred.test("+919833514229")
        );

        //Chaining Predicate function
        System.out.println(
                isPhoneNumberValidPred.and(isPhoneNumberValidPred2).test("+919833514229")
        );

        System.out.println(
                isPhoneNumberValidPred.or(isPhoneNumberValidPred2).test("+919833514229")
        );

        //Same way Bi Predicate - take two input and return boolean value
    }

    static boolean isPhoneNumberValid(String phoneNumber) {
        return phoneNumber.startsWith("+91") && phoneNumber.length() == 13;
    }

    static Predicate<String> isPhoneNumberValidPred = _Predicate::isPhoneNumberValid;

    static Predicate<String> isPhoneNumberValidPred2 = phoneNumber ->
            phoneNumber.contains("117");
}
