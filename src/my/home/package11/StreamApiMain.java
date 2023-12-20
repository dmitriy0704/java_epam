package my.home.package11;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class StreamApiMain {
    public static void main(String[] args) {

        /*
          Промежуточные методы:
          filter()
          map()
          flatMap():
          peek():
          sorted():
         */


        List<String> list = List.of("as a the d on and".split("\\s+"));

        //filter():
        list.stream()
                .filter(s -> s.length() > 2)
                .forEach(System.out::print);


        //map():
        list.stream()
                .map(String::toUpperCase)
                .forEach(System.out::print);


        //flatMap():
        OrderType type1 = new OrderType(771);
        type1.add("SEK");
        type1.add("DKK");
        type1.add("NOK");
        type1.add("EUR");
        OrderType type2 = new OrderType(779);
        type2.add("SEK");
        type2.add("PLN");
        type2.add("CZK");
        type2.add("EUR");
        List<OrderType> orderTypes = List.of(type1, type2);
        List<String> currencyList =
                orderTypes.stream()
                        .map(OrderType::getCurrencyNames)
                        .flatMap(Collection::stream)
                        .collect(Collectors.toList());
        System.out.println(currencyList);

        //peek():
        list.stream()
                .map(String::length)
                .peek(s -> System.out.println(s + "-"))
                .map(n -> n + 100)
                .forEach(s -> System.out.println(s + " "));

        //sorted()
        list.stream()
                .sorted()
                .forEach(s -> System.out.println(s + " "));


        /*
        * Терминальные операции:
        * forEach():
        * findFirst()
        * findAny()
        * count()
        *
        *
        * */

        //findFirst()
        String firstStr = list.stream()
                .filter(s -> s.matches("a\\w*"))
                .findFirst()
                .orElse("none");
        System.out.println(firstStr);


        //findAny():
        List<String> list2 = List.of("as a the d on ank anc anf".split("\\s+"));
        System.out.println("findAny():");
        String anyStr = list2.stream()
                .filter(s -> s.matches("an[a-z]"))
                .findAny()
                .orElse("none");
        System.out.println(anyStr);

        //count():
        long count = list2.stream()
                .filter(s -> s.length()>2)
                .count();
        System.out.println(count);

        

    }
}
