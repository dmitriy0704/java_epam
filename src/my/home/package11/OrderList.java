package my.home.package11;

import java.util.ArrayList;
import java.util.List;

public class OrderList {
    private List<Order> orders;

    public OrderList() {
        this.orders = new ArrayList<Order>();
    }

    public OrderList(List<Order> orders) {
        this.orders = orders;
    }

    public List<Order> getOrders() {
        //  return orders; // возворащает изменяемый список, а надо
//        return List.copyOf(orders);
        //или
        Order[] array = {};
        return List.of(orders.toArray(array));
    }
}
