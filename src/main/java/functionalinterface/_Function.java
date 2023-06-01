package functionalinterface;

import java.net.Inet4Address;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        // Normal Function
        int incrementedNum1 = increment(0);
        System.out.println(incrementedNum1);

        // Function class - take one input and return one result
        int incrementedNum2 = incrementByOne.apply(1);
        System.out.println(incrementedNum2);

        // Function class
        int multiply = multipleByTen.apply(incrementedNum2);
        System.out.println(multiply);

        // chain multiple function.
        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOne.andThen(multipleByTen);
        System.out.println(addBy1AndThenMultiplyBy10.apply(3));

        // Bi Function - take 2 input and return single result
        int result = addTwoNumBiFunc.apply(2,3);
        System.out.println(result);

    }
    static Function<Integer, Integer> incrementByOne = num -> num + 1;

    static Function<Integer, Integer> multipleByTen = num -> num * 10;

    static BiFunction<Integer, Integer, Integer> addTwoNumBiFunc = (num1, num2) -> num1 + num2;

    static int increment(int num) {
        return num + 1;
    }

    static int addTwoNum(int num1, int num2) { return num1 + num2; }
}
