package my.home.package09;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        double i = parseFromFrance("ab");
        System.out.println(i);
    }

    public static double parseFromFrance(String numString) {
        NumberFormat format = NumberFormat.getInstance(Locale.FRENCH);
        double numFrance = 0;
        try {
            numFrance = format.parse(numString).doubleValue();
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return numFrance;
    }
}
