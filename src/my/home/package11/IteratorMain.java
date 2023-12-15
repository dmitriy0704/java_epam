package my.home.package11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {

        final int controlAmount = 20;
        final int discountPercent = 10;

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
//            System.out.println(order);
        }
        // или
//        orders.forEach(System.out::println);

        // Поиск, удаление, изменение элементов списка. Классический способ:
        while (iterator.hasNext()) {
            Order current = iterator.next();
            if (current.getAmount() < controlAmount) {
                iterator.remove();
                continue;
            }
            current.setAmount(current.getAmount() * (100 - discountPercent) / 100.0);
        }
//        System.out.println(orders);

        // Поиск, удаление, изменение элементов списка. Функциональные интерфейсы:
        orders.removeIf(o -> o.getAmount() <= controlAmount);
        orders.forEach(o -> o.setAmount(o.getAmount() * (100 - controlAmount) / 100.0));
        orders.forEach(System.out::println);


        // ====== ListIterator ===== //

    }
}
