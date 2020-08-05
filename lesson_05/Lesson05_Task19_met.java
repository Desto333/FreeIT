package lesson_05;

import java.util.StringTokenizer;

public class Lesson05_Task19_met {
    public static void main(String[] args) {
        String string = "      Для решения этой проблемы был создан класс java.lang.StringBuilder, который\n" +     // create a String object and fill fill it with a text
                "позволяет более эффективно работать над модификацией строки. Класс является\n" +
                "mutable, то есть изменяемым - используйте его, , если Вы хотите изменять\n" +
                "содержимое строки. StringBuilder НЕ рекомендуется     использовать в многопоточных\n" +
                "средах.    ";
        int counter = 0;                                                                                            // create a counter and set it with 0
        StringTokenizer strTok = new StringTokenizer(string, " ,.\n\t\r!?-;:");                      // create StringTokenizer object for our string and specify all the delimeters to get the words
        while(strTok.hasMoreTokens()) {                                                                         // create a cycle to work until our string has more tokens(words)
            System.out.println(strTok.nextToken());                                                                        // print out to console all the tokens(words) got
            counter++;                                                                                          // counter is incremented each time a new token(word) is created
        }

        System.out.println(String.format("В нашей строке %d слов", counter));                                   // print out to console the number of tokens(words) in our string
    }
}
