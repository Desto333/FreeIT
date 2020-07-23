package lesson_03;

/* Задание 13. Создать последовательность случайных чисел, найти и вывести наибольшее из них. */

import java.util.Arrays;

public class Lesson03_Task13_met {
    public static void main(String[] args) {
        int[] arr = new int[10];                // создаем массив на 10 элементов

        for (int i = 0; i < arr.length; i++) {      // заполняем массив случайными числами
            arr[i] = (int)(Math.random()*100);
        }

        for (int start = 0; start < arr.length; start++) {          // сортируем массив по возрастанию
            for (int index = 0; index < arr.length-1; index++) {
                if(arr[index] > arr[index+1]) {
                    int temp = arr[index];
                    arr[index] = arr[index+1];
                    arr[index+1] = temp;
                }
            }
        }
        System.out.println("Наибольшее число последовательности: " + arr[arr.length-1]);       // выводим последний элемент отсортированного массива, который будем самым большим числом последовательности
    }
}
