package my.home.package11;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class CollectionsMain {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>();
        Collection<Integer> collection1 = new ArrayList<>();
        System.out.println("add()");
        collection.add(15);
        collection.add(42);
        System.out.println(collection);
        System.out.println("remocve()");
        collection.remove(42);
        System.out.println(collection);

        collection1.add(38);
        collection1.add(54);

        System.out.println("addAll()");
        collection.addAll(collection1);
        System.out.println(collection);

        System.out.println("contains()");
        System.out.println(collection.contains(42));
        System.out.println("equals()");
        System.out.println(collection.equals(collection1));
        System.out.println("size()");
        System.out.println(collection.size());

        //TODO: выяснить как переводить коллецию в массив!
        System.out.println(Arrays.toString(collection.toArray()));


        // === Методы Stream API === //
        Stream<Integer> stream = collection.stream();
        System.out.println("stream.count()");
        System.out.println(Arrays.toString(stream.toArray()));
        System.out.println("stream.removeIf()");
        System.out.println(collection.removeIf(i -> i > 50));
        System.out.println(collection);
        System.out.println("forEach()");
        collection.forEach(System.out::println);

    }
}
