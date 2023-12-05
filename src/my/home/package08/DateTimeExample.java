package my.home.package08;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class DateTimeExample {
public void test(){
    // Интернационализация чисел:

    NumberFormat numberFormat = NumberFormat.getInstance(Locale.GERMAN);
    String source = "1.234,567";
    NumberFormat numberFormatUS = NumberFormat.getInstance(Locale.US);
    NumberFormat numberFormatFR = NumberFormat.getInstance(Locale.FRANCE);

    try {
        double number = numberFormat.parse(source).doubleValue();
        System.out.println(number);

        String resultUS = numberFormatUS.format(number);
        System.out.println("US(number) : " + resultUS);

        String resultFr = numberFormatFR.format(number);
        System.out.println("FR(number): " + resultFr);

        double numberUs = numberFormatUS.parse(source).doubleValue();
        System.out.println("DE -> US(parse number): " + numberUs);

        double numberFr = numberFormatFR.parse(source).doubleValue();
        System.out.println("DE -> FR(parse number): " + numberFr);
    }catch (ParseException exception){
        exception.printStackTrace();
    }
}
}
