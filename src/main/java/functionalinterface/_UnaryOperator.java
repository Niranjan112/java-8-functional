package functionalinterface;

import java.util.function.UnaryOperator;

public class _UnaryOperator {

    public static void main(String[] args) {
        UnaryOperator<Integer> multiplyBy10 = num -> 10 * num;

        UnaryOperator<Integer> multiplyBy20 = new UnaryOperator<Integer>() {
            @Override
            public Integer apply(Integer x) {
                return 20 * x;
            }
        };

        System.out.println(multiplyBy10.apply(3));
        System.out.println(multiplyBy20.apply(2));
    }
}
