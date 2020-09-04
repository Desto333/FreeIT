package lesson_10;

/* Задание 29. Создать список оценок учеников с помощью ArrayList, заполнить случайными
оценками. Удалить неудовлетворительные оценки из списка.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Lesson10_Task29_met {
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

        for (int i = listOfGrades.size()-1; i >= 0; i--) {      // remove all grades lower than 3
            if(listOfGrades.get(i) < 3) {
                listOfGrades.remove(i);
            }
        }

        for (int i = 0; i < listOfGrades.size(); i++) {         //print out all elements of our ArrayList
            System.out.print(listOfGrades.get(i) + " ");
        }
    }
}
