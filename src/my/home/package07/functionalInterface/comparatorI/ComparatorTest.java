package my.home.package07.functionalInterface.comparatorI;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorTest {
    public void test(){
        Comparator<String> comparator = (s1, s2) -> s2.length() - s1.length();
        String str = "and java course epam the rose lion wolf hero green white red white";
        Arrays.stream(str.split("\\s"))
                .sorted(comparator)
                .forEach(s -> System.out.printf("%s ", s));
    }
}
