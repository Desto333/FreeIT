package lesson_10;

/* Задание 31. Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Найти самую высокую оценку с использованием итератора.*/

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class Lesson10_Task31_met {
    public static void main(String[] args) {
        Random random = new Random();                           // create random class object
        List<Integer> listOfGrades = new ArrayList<>();         // create new ArrayList and fill it with random grades from 0 to 10
        for (int i = 0; i < 30; i++) {
            listOfGrades.add(i, random.nextInt(11));
        }

        for (int i = 0; i < listOfGrades.size(); i++) {         //print out all elements of our ArrayList
            System.out.print(listOfGrades.get(i) + " ");
        }
        System.out.println();

        int maxGrade = 0;                                       // set maximum Grade as 0
        Iterator iterator = listOfGrades.iterator();            // create iterator for our ArrayList
        while(iterator.hasNext()) {                             // while iterating through our ArrayList, we find maximum grade in the ArrayList
            int curGrade = (int)iterator.next();
            if(curGrade > maxGrade) {
                maxGrade = curGrade;
            }
        }

        System.out.println("Максимальная оценка: " + maxGrade);     // print maximum grade out
    }
}
