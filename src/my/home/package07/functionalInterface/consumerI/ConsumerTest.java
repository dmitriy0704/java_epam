package my.home.package07.functionalInterface.consumerI;

import java.util.Arrays;
import java.util.function.Consumer;

public class ConsumerTest {
    public void test(){
        String str = "as a- the-d -on and";
        String regex = "-";
        Consumer<String> consumer = s ->
                System.out.println(
                        Arrays.toString(s.split(regex))
                );
        consumer.accept(str);

    }
}
