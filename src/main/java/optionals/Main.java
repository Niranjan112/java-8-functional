package optionals;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String email = "niranjan@gmail.com";
        Optional<String> stringOptional = Optional.ofNullable(email);
        stringOptional.ifPresentOrElse(
                e -> System.out.println(e),
                () -> System.out.println("Email not available")
        );
    }
}
