package streams;

import java.util.Comparator;
import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(12, 3, 5, 12, 45, 6, 3);
        List<String> courses = List.of("JPA", "Spring Boot", "AWS", "Java", "Python", "System Design");

        numbers
                .stream()
                .distinct()
                .forEach(System.out::println);

        System.out.println("=====================================================");

        numbers
                .stream()
                .distinct()
                .sorted()
                .forEach(System.out::println);

        System.out.println("=====================================================");

        System.out.println(
                numbers
                        .stream()
                        .reduce(0, Integer::sum)
        );

        System.out.println("=====================================================");

        // Sort By String length
        courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);
    }
}
