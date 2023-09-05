package my.home.package02;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        var v = 0;
        String[] strings = {"a","b","c"};
        for (; v < strings.length; v++) {
            strings[v] = "java";
        }
        System.out.println(Arrays.toString(strings));
    }
}
