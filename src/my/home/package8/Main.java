package my.home.package8;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String str1 = " " + null + " 4" + 8 + 11;
        System.out.println(str1);
        str1 = str1.strip();
        System.out.println(str1);
        String str3 = String.join("-", "Java", "17", "SE");
        System.out.println(str3);

        String names = " angelA Alena  Agnes anette albina Anastasiya  ALLA ArinA ";
        names = names.strip();
        String[] namesArr = names.split(" ");
        System.out.println(Arrays.toString(namesArr));

        for (int j = 0; j < namesArr.length - 1; j++) {
            for (int i = j + 1; i < namesArr.length; i++) {
                if (namesArr[i].compareToIgnoreCase(namesArr[j]) < 0) {
                    String temp = namesArr[j];
                    namesArr[j] = namesArr[i];
                    namesArr[i] = temp;
                }
            }
        }
        for (String arg : namesArr) {
            if (!arg.isEmpty()) {
                System.out.println(arg);
            }
        }
    }
}
