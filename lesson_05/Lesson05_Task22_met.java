package lesson_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson05_Task22_met {
    public static void main(String[] args) {
        String string = "\"      Для решения этой 0x3FFl проблемы был создан класс java.lang.StringBuilder, который\\n\" +     " +      // create a String and fill it with a text
                "                   create a String object and fill fill it with a text\n" +
                "                \"позволяет более эффективно 0x141D12 работать над модификацией строки. Класс является\\n\" +\n" +
                "                \"mutable, то есть изменяемым - используйте его, , если Вы хотите изменять\\n\" +\n" +
                "                \"содержимое строки. StringBuilder НЕ рекомендуется     0x1101010110 использовать в многопоточных\\n\" +\n" +
                "                \"средах.    \"";
        Pattern pattern = Pattern.compile("0[X|x][0-9a-fA-Fl]{1,16}");      // create a Pattern object and compile a regular expression for a hexadecimal number
        Matcher matcher = pattern.matcher(string);                          // create a Matcher object
        while(matcher.find()) {                                             // start a cycle until matcher finds hexadecimal numbers
            System.out.println(matcher.group());                            // print out to console hexadecimal number found by Matcher
        }
    }
}
