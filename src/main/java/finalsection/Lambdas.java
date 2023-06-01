package finalsection;

import java.util.function.Function;

public class Lambdas {
    public static void main(String[] args) {
        Function<String, String> upperCaseName1 = name -> name.toUpperCase();
        Function<String, String> upperCaseName2 = String::toUpperCase; // Method ref example

        System.out.println(upperCaseName1.apply("Niranjan"));
        System.out.println(upperCaseName2.apply("Sharma"));

        // Notes
        // 1. In functional prog, Function should never change state of global or outside variable.
    }
}
