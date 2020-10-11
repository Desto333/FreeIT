package lesson_10;

/* Задание 30. Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.*/

import java.util.*;

public class Lesson10_Task30_met {
    public static void main(String[] args) {
        Random random = new Random();                   //create new Random class object
        List<Integer> list = new ArrayList<>();         // create new ArrayList
        for (int i = 0; i < 30; i++) {                  // fill it with random number from 0 to 20
            list.add(i, random.nextInt(20));
        }
        list.forEach(x -> System.out.print(x + " "));     // print out all elements of our ArrayList
        System.out.println();
        list.stream().distinct().forEach(x -> System.out.print(x + " ")); // remove all repeating elements and print out the rest

    }
}
