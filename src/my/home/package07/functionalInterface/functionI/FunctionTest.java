package my.home.package07.functionalInterface.functionI;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionTest {
    public void test() {
        String[] arrStr = {" as ", " a ", " the ", " d ", " on ", " and "};
        Integer[] arrInt = {1, 2, 3};

        Function<String, Integer> fun1 = String::length;
        Function<Integer, String> fun2 = Integer::toBinaryString;
        Function<Integer, Integer> fun3 = fun1.compose(fun2);
        Function<String, String> fun4 = String::toUpperCase;
        Function<Integer, Integer> fun5 = i -> i * 2;

        //Test:
        Function<String, String> funcTrim = String::trim; // Вызывается первой
        Function<String, String> funcUpper = String::toUpperCase;
        Function<String, String> funcRes = funcUpper.compose(funcTrim);

        // apply
        System.out.println(Arrays.stream(arrStr).map(fun4).collect(Collectors.toList()));
        System.out.println(Arrays.stream(arrInt).map(fun5).collect(Collectors.toList()));

        //compose
        System.out.println(
                Arrays.stream(arrStr)
                        .map(funcRes)
                        .collect(Collectors.toList())
        );

        //andThen
        // вызывается в обратном пордяке от compose

    }
}
