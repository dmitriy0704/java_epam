package my.home.package11;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListMain {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(5);
        list.add(7);
        list.add(28);
        list.add(36);
        list.add(42);
        list.add(7);
        list.add(82);
        System.out.println(list);
        System.out.println("size: " + list.size());

        list.addFirst(4);
        System.out.println(list);
        System.out.println(list.removeLastOccurrence(7));
        System.out.println(list);


        //Очереди:
        Queue<String> queue = new LinkedList<>(){
            {
                this.offer("Jeans");
            }
        };
        queue.add("Dress");
        queue.offer("Gloves");
        queue.add("T-Shirt");
        queue.stream()
                .filter(s -> !s.endsWith("s"))
                .forEach(System.out::println);
        System.out.println("_____");
        queue.stream().forEach(System.out::println);

        //PriorityQueue:
        Queue<String> priority = new PriorityQueue<>(Comparator.reverseOrder());
        priority.offer("J");
        priority.offer("A");
        priority.offer("V");
        priority.offer("A");
        priority.offer("1");
        priority.offer("4");
        while (!priority.isEmpty()){
            System.out.println(priority.poll());
        }
     }
}
