package my.home.package07.functionalInterface.predicateI;

import java.util.Arrays;
import java.util.function.BiPredicate;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateTest {
    public void test() {
//        Predicate<String> predicateStr1 = s -> s.length() > 4;
//        return predicateStr1.test("test string");

//        Predicate<Integer> predicateTest = i -> i > 5;
//        System.out.println(predicateTest.test(4));

        String[] arrString = {"as", "a", "the", "d", "on", "end", "and"};
        int[] arrInteger = {1, 2, 3, 4, 5};

        //filter():
        System.out.println();
        System.out.println(
                Arrays.stream(arrString)
                        .filter(s -> s.length() > 2)
                        .collect(Collectors.toList())
        );

        //anyMatch
        System.out.println();
        System.out.println(
                Arrays.stream(arrInteger)
                        .anyMatch(i -> i > 2)
        );

        //allMatch
        System.out.println();
        System.out.println(
                Arrays.stream(arrInteger)
                        .allMatch(i -> i > 0)
        );

        //default Predicate<T> and(Predicate<? super T> other)
        Predicate<String> predicate1 = s -> s.contains("a");
        System.out.println(
                Arrays.stream(arrString)
                        .filter(predicate1.and(s -> s.contains("n")))
                        .collect(Collectors.toList())
        );

        // или
        System.out.println(
                Arrays.stream(arrString)
                        .filter(((Predicate<String>) s -> s.contains("a"))
                                .and(s -> s.contains("n")))
                        .collect(Collectors.toList())
        );

        //default Predicate<T> or(Predicate<? super T> other)
        System.out.println(
                Arrays.stream(arrInteger)
                        .filter(((IntPredicate) i -> i > 1)
                                .or((IntPredicate) i -> i > 2))
                        .boxed()
                        .collect(Collectors.toList())
        );


        Predicate<String> stringPredicate = s -> s.contains("m");
        System.out.println(
                Arrays.stream(arrString)
                        .filter(stringPredicate.negate())
                        .collect(Collectors.toList())
        );

        // или так...
        System.out.println(
                Arrays.stream(arrString)
                        .filter(((Predicate<String>) s -> s.contains("r"))
                                .negate())
                        .collect(Collectors.toList())
        );

        //static Predicate<T> not(Predicate<? super T> target) — более короткий вариант отрицания
        System.out.println(
                Arrays.stream(arrString)
                        .filter(Predicate.not(s -> s.contains("a")))
                        .collect(Collectors.toList())
        );

        //static Predicate<T> isEquals(Predicate<? super T> target) — более короткий вариант отрицания

        System.out.println(
                Arrays.stream(arrString)
                        .filter(Predicate.isEqual("and"))
                        .collect(Collectors.toList())
        );


        BiPredicate<String, Integer> biPredicate = (s, max) -> s.length() < max;
        BiPredicate<Integer, Integer> integerBiPredicate = (i, j) -> i < j;

        System.out.println(biPredicate.test("Java", 10));
        System.out.println(integerBiPredicate.test(2, 3));


    }
}
