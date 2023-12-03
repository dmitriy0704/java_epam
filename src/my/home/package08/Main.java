package my.home.package08;

import java.util.StringJoiner;

public class Main {
    public static void main(String[] args) {

        /* Основные классы:
         * String
         * StringBuilder
         * StringBuffer
         *
         * Классы для форматирования:
         * Formatter
         * Matcher
         * Pattern
         * StringJoiner
         *
         * */

        // ====== String ====== //

        String str1 = "Test string";
        String str2 = "Test string";

        // equals():
        System.out.println(str1.equals(str2));
        // intern():
        System.out.println(str1 == str2.intern());
        // compare():
        System.out.println(str1.compareTo(str2));
        //substring()
        System.out.println(str1.substring(1,3));
        System.out.println(str1.replace("s", "S"));


        //StringJoiner
        System.out.println("StringJoiner:");
        StringJoiner joiner = new StringJoiner(":","<<",">>");
        String result = joiner.add("blanc").add("range").add("blanc").toString();
        System.out.println(result);

    }
}
