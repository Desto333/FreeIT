package lesson_03;

/* Задание 16. Определите сумму элементов одномерного массива, расположенных между минимальным и максимальным значениями. */

import java.util.Arrays;

public class Lesson03_Task16_met {
    public static void main(String[] args) {

        int[] arr = new int[20];                // создаем массив на 20 элементов

        for (int i = 0; i < arr.length; i++) {      // заполняем массив случайными числами
            arr[i] = (int)(Math.random()*100);
        }

        System.out.println(Arrays.toString(arr));   // выводим заполненный массив на экран

        int min = arr[0];           // предполагаем, что минимальный элемент массива - первый элемент массива
        int minIndex = 0;           // его индекс = 0
        int max = arr[0];       // по аналогии с минимальным элементом, находим максимальный элемент и его индекс
        int maxIndex = 0;

        for (int i = 0; i < arr.length; i++) {      // перебираем все элементы массива, находим минимальный и максимальный элементы и их индексы
                if(arr[i] < min){
                    min = arr[i];
                    minIndex = i;
                }
                if(arr[i] > max){
                    max = arr[i];
                    maxIndex = i;
                }
        }

        int sum = 0;                // сумма элементов между макс и мин элементами сначала равна 0
        if(maxIndex > minIndex) {       // считаем сумму, индекс макс элемен больше индекса мин элемен
            for (int i = minIndex+1; i < maxIndex; i++) {
                sum = sum + arr[i];
            }
        }
        if(maxIndex < minIndex) {       // считаем сумму, индекс мин элемен больше индекса макс элемен
            for (int i = maxIndex+1; i < minIndex; i++) {
                sum = sum + arr[i];
            }
        }

        System.out.println("Сумма элементов равна " + sum);     //выводим сумму на экран
    }
}
