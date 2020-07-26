package lesson_03;

/* Задание 13. Создать последовательность случайных чисел, найти и вывести наибольшее из них. */

import java.util.Arrays;

public class Lesson03_Task13_met {
    public static void main(String[] args) {
        int[] arr = new int[10];                // создаем массив на 10 элементов

        for (int i = 0; i < arr.length; i++) {      // заполняем массив случайными числами
            arr[i] = (int)(Math.random()*100);
        }

        for (int i = 0; i < arr.length; i++) {      // выводим массив на экран
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int max = arr[0];       // предполагаем, что максимальный элемент массива - первый элемент массива

        for (int i = 0; i < arr.length; i++) {      // перебираем все элементы массива, находим максимальный элемент
            if(arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Наибольшее число последовательности: " + max);       // выводим наибольшее число последовательности
    }
}
