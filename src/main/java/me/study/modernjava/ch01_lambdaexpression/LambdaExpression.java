package me.study.modernjava.ch01_lambdaexpression;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpression {
    public static void main(String[] args) {
        final Runnable runnable =
            () -> System.out.println("asdasd");

        runnable.run();


        final Calculator<Integer> addition = (o1, o2) -> {
            System.out.printf("%d + %d = %d\n", o1, o2, o1+o2);
            return o1 + o2;
        };

        System.out.println(addition.calc(2, 3));

        final Calculator<String> concat = (s1, s2) -> s1 + s2;
        System.out.println(concat.calc("a", "b"));


        Function<String, Integer> fn = str -> Integer.parseInt(str);

        Consumer<String> consumer = str -> str.toString();

        Predicate<String> predicate = str -> str != null;

        Supplier<String> supplier = () -> "a";

        fn.apply("1");
        consumer.accept("as");
        predicate.test("as");
        supplier.get();
    }

    @FunctionalInterface
    interface Calculator<T> {
        T calc(T operand1, T operand2);
    }

}
