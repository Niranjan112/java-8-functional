package streams;

import java.text.StringCharacterIterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static streams._Stream.Gender.*;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Niranjan", MALE),
                new Person("Esu", FEMALE),
                new Person("Kylie", FEMALE),
                new Person("SRK", MALE),
                new Person("Salmaan", MALE)
        );

        List<Gender> genderList = people.stream()
                .map(person -> person.gender)
                .collect(Collectors.toList());
        System.out.println(genderList);
        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);

        // allMatch, anyMatch, noneMatch
        Predicate<Person> femalePred = person -> person.gender.equals(FEMALE);
        boolean res = people.stream()
                .allMatch(femalePred);
        System.out.println(res);

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
