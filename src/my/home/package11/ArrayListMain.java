package my.home.package11;

import java.util.ArrayList;
import java.util.List;

public class ArrayListMain {
    public static void main(String[] args) {

        /*
        * Методы:
        * get(int index)
        * add(int index, E element)
        * remove(int index)
        * E set(I index, E index) - возвращает заменяемый элемент
        * boolean addAll(int index, Collection c) - вставляет коллекцию c,
          с позиции index
        * int indexOf(Object ob) - возвращает позицию элемента
        * sort(Comparator)
        * List<E> subList(int fromIndex, int toIndex) — извлекает часть
          коллекции в указанных границах;
        * static <E> List<E> copyOf(Collection <? extentds E> coll) — создает
          немодифицируемый список на основе передаваемой коллекции.
        *
        * */

        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(7);
        list.add(42);
        list.add(null);
        list.add(50);
        list.add(77);

        System.out.println(list); //[5, 7, 42, null, 50, 77]

        list.add(5,87);
        System.out.println(list); //[5, 7, 42, null, 50, 87, 77]

    }
}
