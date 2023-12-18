package my.home.package11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class IteratorMain {
    public static void main(String[] args) {

        final int controlAmount = 20;
        final int discountPercent = 10;

        boolean showExample = false;

        List<Order> orders = new ArrayList<Order>() {
            {
                add(new Order(231, 12.0));
                add(new Order(389, 29.0));
                add(new Order(747, 32.0));
                add(new Order(517, 18.0));
                add(new Order(414, 17.0));
                add(new Order(777, 10.0));
            }
        };

        Iterator<Order> iterator = orders.iterator();

        //Перебор элементов:
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (showExample) {
                System.out.println(order);
            }
        }
        // или
        if (showExample) {
            orders.forEach(System.out::println);
        }

        // Поиск, удаление, изменение элементов списка. Классический способ:
        while (iterator.hasNext()) {
            Order current = iterator.next();
            if (current.getAmount() < controlAmount) {
                iterator.remove();
                continue;
            }
            current.setAmount(current.getAmount() * (100 - discountPercent) / 100.0);
        }
        if (showExample) {
            System.out.println(orders);
        }

        // Поиск, удаление, изменение элементов списка. Функциональные интерфейсы:
        orders.removeIf(o -> o.getAmount() <= controlAmount);
        orders.forEach(o -> o.setAmount(o.getAmount() * (100 - controlAmount) / 100.0));
        orders.forEach(System.out::println);

        // ====== ListIterator - навигация по списку ===== //
        // E previous(), int previousIndex(), boolean hasPrevious()

        // === Stream API === //

        List<Order> orderList = orders.stream()
                .filter(o -> o.getAmount() <= controlAmount)
                .map(o -> {
                            o.setAmount(o.getAmount() * (100 - discountPercent) / 100.0);
                            return o;
                        }
                ).collect(Collectors.toList());

        // filter():
        List<String> strings = List.of("as a the d on and".split("\\s+"));
        strings.stream()
                .filter(s -> s.length() < 2)
                .forEach(s -> System.out.print(s + " "));

        // map():
        strings.stream()
                .map(String::length)
                .forEach(s -> System.out.print(s + " "));

        strings.stream()
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        // sorted():
        strings.stream()
                .sorted()
                .forEach(s -> System.out.print(s + " "));

        strings.stream()
                .sorted((s1, s2) -> s1.length() - s2.length())
                .forEach(s -> System.out.print(s + " "));
    }
}
