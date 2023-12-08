package my.home.package09;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        try {
            double i = parseFromFrance("ab");
            System.out.println(i);
        } catch (ParseException e) {
            System.out.println(e.getMessage());
        }
    }

    public static double parseFromFrance(String numString) throws ParseException {
        NumberFormat format = NumberFormat.getInstance(Locale.FRENCH);
        double numFrance = 0;
        numFrance = format.parse(numString).doubleValue();
        return numFrance;
    }

    public static void test() {
        int size = 5;
        assert (size > 0) : "Incorrect size";


    }
}
