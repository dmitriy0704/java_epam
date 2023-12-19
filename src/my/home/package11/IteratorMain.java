package my.home.package11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class IteratorMain {
    public static void main(String[] args) {

        final int controlAmount = 20;
        final int discountPercent = 10;

        List<Integer> collection = new ArrayList<>();
        collection.add(15);
        collection.add(32);
        collection.add(44);
        collection.add(58);

        Iterator<Integer> integers = collection.iterator();
        while (integers.hasNext()) {
            System.out.print(integers.next() + ", ");
        }

        collection.removeIf(
                integer -> integer > 50
        );
        collection.forEach(
                System.out::println
        );

        ListIterator<Integer> listIterator = collection.listIterator();
        while (listIterator.hasPrevious()){
            listIterator.next();
        }
    }
}
