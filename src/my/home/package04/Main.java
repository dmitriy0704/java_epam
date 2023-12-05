package my.home.package04;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jonh", 42);
        Person person2 = new Person("Jonh", 42);

        System.out.println(person1.equals(person2));
    }
}
