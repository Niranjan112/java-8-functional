package functionalinterface;

import java.util.function.BinaryOperator;

public class _BinaryOperator {

    /**
     * The BinaryOperator takes two arguments of the same type and returns a result of the same type of its arguments.
     *
     * The BiFunction<Integer, Integer, Integer> which accepts and returns the same type,
     * can be replaced with BinaryOperator<Integer>.
     * */
    static BinaryOperator<Integer> sumOfTwo = (num1, num2) -> num1 + num2;

    public static void main(String[] args) {
        Integer res = sumOfTwo.apply(1,2);
        System.out.println(res);
    }
}
