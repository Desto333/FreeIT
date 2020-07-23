package lesson_03;

/* Задание 14. Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера. */

public class Lesson03_Task14_met {
    public static void main(String[] args) {
        int[] arr = new int[20];                // создаем массив на 20 элементов

        for (int i = 0; i < arr.length; i++) {      // заполняем массив случайными числами
            arr[i] = (int)(Math.random()*10);
        }

        int[] arrCopy = arr;    // создаем копию массива arr

        for (int start = 0; start < arrCopy.length; start++) {          // сортируем копию массива по возрастанию
            for (int index = 0; index < arrCopy.length-1; index++) {
                if(arrCopy[index] > arrCopy[index+1]) {
                    int temp = arrCopy[index];
                    arrCopy[index] = arrCopy[index+1];
                    arrCopy[index+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {      // находим местонахождение минимального элемента в оригинальном массиве
            if(arr[i] == arrCopy[0]) {
                System.out.println("Минимальная оценка: " + arr[i] + ", находится под номером: " + i);  // выводим на экран
            }
        }

        for (int i = 0; i < arr.length; i++) {      // находим местонахождение максимального элемента в оригинальном массиве
            if(arr[i] == arrCopy[arrCopy.length-1]) {
                System.out.println("Максимальная оценка: " + arr[i] + ", находится под номером: " + i);  // выводим на экран
            }
        }
    }
}
