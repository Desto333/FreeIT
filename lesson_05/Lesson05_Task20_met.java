package lesson_05;

import java.util.StringTokenizer;

public class Lesson05_Task20_met {
    public static void main(String[] args) {
        String string = "      Для решения этой проблемы был создан класс java.lang.StringBuilder, который\n" +     // create a String object and fill fill it with a text
                "позволяет более эффективно работать над модификацией строки. Класс является\n" +
                "mutable, то есть изменяемым - используйте его, , если Вы хотите изменять\n" +
                "содержимое строки. StringBuilder НЕ рекомендуется     использовать в многопоточных\n" +
                "средах.    ";
        StringTokenizer strTok = new StringTokenizer(string, " ,.\n\t\r!?-;:");                      // create StringTokenizer object for our string and specify all the delimeters to get the words
        StringBuilder resultString = new StringBuilder();                                                   // create a StringBuilder object in order to create a text according to the task
        while(strTok.hasMoreTokens()) {                                                                         // create a cycle to work until our string has more words
            String tempString = strTok.nextToken();                                                     // place a new word to temporary String
            System.out.println(tempString);                                                           // print out to console a new word found
            char[] arr = tempString.toCharArray();                                                  // convert each word found into a temporary char array
            resultString.append(arr[arr.length - 1] + " ");                                                // add the last symbol of each word to resultString
        }
        System.out.println(resultString);                                                                   // print out to console the result
    }
}
