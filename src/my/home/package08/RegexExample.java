package my.home.package08;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public void test(){
        // ====== Regex ====== //
        // ====== Pattern ====== //

        //Проверка соответсвия шаблону:
//        Pattern pattern = Pattern.compile("x+y");
//        Matcher matcher = pattern.matcher("xxxy");
//        boolean res = matcher.matches();
//        System.out.println(res);

        // Поиск и выбор подстроки, заданной шаблоном:
        String regex = "\\w{6,}@\\w+\\.\\p{Lower}{2,4}";
        String input = "адреса эл. почты:dmitriy.folomkin@gmail.com";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);
        while (matcher.find()){
            System.out.println("email: " + matcher.group());
        }
    }
}
