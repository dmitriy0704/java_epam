package my.home.package12.callablepack;

import java.util.List;

public class CallableMain {
    public static void main(String[] args) throws Exception {
        List<Integer> listInt = List.of(1, 10, 100, 1000, 10000);
        int sum1 = listInt.stream().mapToInt(x -> x).sum();
        int sum2 = listInt.stream().reduce(0, Integer::sum);
        System.out.println(sum1 + ", " + sum2);

        ActionCallable callable = new ActionCallable(listInt);
        int sum = callable.call();
        System.out.println(sum);
    }
}
