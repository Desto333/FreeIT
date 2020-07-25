package lesson_03;

/* Задание 14. Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера. */

public class Lesson03_Task14_met {
    public static void main(String[] args) {
        int[] arr = new int[20];                // создаем массив на 20 элементов

        for (int i = 0; i < arr.length; i++) {      // заполняем массив случайными числами
            arr[i] = (int)(Math.random()*10);
        }

        for (int i = 0; i < arr.length; i++) {      // выводим массив на экран
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        int min = arr[0];           // предполагаем, что минимальный элемент массива - первый элемент массива
        int max = arr[0];       // по аналогии с минимальным элементом, находим максимальный элемент и его индекс

        for (int i = 0; i < arr.length; i++) {      // перебираем все элементы массива, находим минимальный и максимальный элементы и их индексы
            if(arr[i] < min){
                min = arr[i];
            }
            if(arr[i] > max){
                max = arr[i];
            }
        }

        System.out.print("Минимальная оценка: " + min + ", находится под номером(-ами): " );  // выводим на экран минимальную оценку
        for (int i = 0; i < arr.length; i++) {                  // выводим на экран номер(-а) минимальной оценки
            if(arr[i] == min) System.out.print(i + " ");
        }

        System.out.println();
        System.out.print("Максимальная оценка: " + max + ", находится под номером(-ами): ");  // выводим на экран максимальную оценку
        for (int i = 0; i < arr.length; i++) {                  // выводим на экран номер(-а) максимальной оценки
            if(arr[i] == max) System.out.print(i + " ");
        }
    }
}
