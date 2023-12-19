package my.home.package11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorMain {
    public static void main(String[] args) {

        Collection<Integer> collection = new ArrayList<>();
        collection.add(15);
        collection.add(32);
        collection.add(44);
        collection.add(58);

        Iterator<Integer> integers = collection.iterator();
        while (integers.hasNext()) {
            System.out.print(integers.next() + ", ");
        }
    }
}
