package my.home.package11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OrderType implements Iterable<String> {
    private int orderId;
    private List<String> currencyNames = new ArrayList<>();

    public OrderType(int orderId) {
        this.orderId = orderId;
    }

    public List<String> getCurrencyNames() {
        return List.copyOf(currencyNames);
    }

    public boolean add(String e) {
        return currencyNames.add(e);
    }

    @Override
    public Iterator<String> iterator() {
        return currencyNames.iterator();
    }

}
