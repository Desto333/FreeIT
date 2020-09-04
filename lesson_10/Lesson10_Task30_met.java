package lesson_10;

/* Задание 30. Создать коллекцию, наполнить ее случайными числами. Удалить повторяющиеся
числа.*/

import java.util.*;

public class Lesson10_Task30_met {
    public static void main(String[] args) {
        Random random = new Random();                   //create new Random class object
        List<Integer> list = new ArrayList<>();         // create new ArrayList and fill it with random number from 0 to 20
        for (int i = 0; i < 30; i++) {
            list.add(i, random.nextInt(20));
        }

        for (int i = 0; i < list.size(); i++) {         // print out all elements of our ArrayList
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        Set<Integer> set = new LinkedHashSet<>();       // create new LinkedHashSet

        set.addAll(list);                               // transform our ArrayList to LinkedHashSet so all repeating elements would be removed
        list.clear();                                   // clear our original ArrayList
        list.addAll(set);                               // transform our LinkedHashSet to ArrayList back

        for (int i = 0; i < list.size(); i++) {         // print out all elements of our ArrayList. All repeating elements should have been removed
            System.out.print(list.get(i) + " ");
        }

    }
}
