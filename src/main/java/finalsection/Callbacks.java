package finalsection;

import java.util.function.Consumer;

public class Callbacks {
    public static void main(String[] args) {
        Consumer<String> messageIfNoLastName = value ->
                System.out.println("No last name provided for " + value);

        hello("Niranjan", "Sharma", messageIfNoLastName);

        hello("Niranjan", null, messageIfNoLastName);

        hello2("Niranjan", null, () -> System.out.println("No last name provided"));
    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println(firstName);
        if(lastName != null) {
            System.out.println(lastName);
        } else {
            callback.accept(firstName);
        }
    }

    // Using Runnable without arg and no return.
    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println(firstName);
        if(lastName != null) {
            System.out.println(lastName);
        } else {
            callback.run();
        }
    }
}
