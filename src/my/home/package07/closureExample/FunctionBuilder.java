package my.home.package07.closureExample;

import java.util.function.Function;

public class FunctionBuilder<T> {
    public static Function<String, Integer> build(String strNum){
        int count = 1;
        return t -> {
            int res = Integer.valueOf(strNum + t) + count;
            return res;
        };


// Вызов:
//        Function<String, Integer> function = FunctionBuilder.build("100");
//        int res = function.apply("77");
//        System.out.println(res);
    }

}
