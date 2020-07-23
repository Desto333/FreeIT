package lesson_03;

/* Задание 15. Создать массив, заполнить его случайными элементами, распечатать, перевернуть, и снова распечатать
(при переворачивании нежелательно создавать еще один массив). */

public class Lesson03_Task15_met {
    public static void main(String[] args) {
        int[] arr = new int[10];                // создаем массив на 10 элементов

        for (int i = 0; i < arr.length; i++) {      // заполняем массив случайными числами
            arr[i] = (int)(Math.random()*100);
        }

        for (int i = 0; i < arr.length; i++) {      //выводим элементы первоначального массива на экран
            System.out.print(arr[i] + " ");
        }
        System.out.println();                       // переводим курсор на новую строку

        for (int i = 0; i < arr.length/2; i++) {        // переворачиваем массив
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        for (int i = 0; i < arr.length; i++) {      //выводим элементы перевернутого массива на экран
            System.out.print(arr[i] + " ");
        }
    }
}
