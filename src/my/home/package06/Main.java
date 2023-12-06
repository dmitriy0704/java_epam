package my.home.package06;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        test(n -> n * 2, 10);
    }

    public static void test(Function<Integer, Integer> f, int x) {
        System.out.println(f.apply(x));
    }

}
