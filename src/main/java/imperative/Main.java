package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static imperative.Main.Gender.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Niranjan", MALE),
                new Person("Esu", FEMALE),
                new Person("Kylie", FEMALE),
                new Person("SRK", MALE),
                new Person("Salmaan", MALE)
        );

        // Imperative approach
        System.out.println("// Imperative approach");
        List<Person> females = new ArrayList<>();
        for (Person person: people) {
            if(person.gender == FEMALE)
                females.add(person);
        }
        System.out.println(females);

        // Declarative approach
        System.out.println("\n// Declarative approach");

        Predicate<Person> personPredicate = person -> MALE == person.gender;

        List<Person> males = people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());
        System.out.println(males);
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
