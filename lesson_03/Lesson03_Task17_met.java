package lesson_03;

/* Задание 17. Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
*/

import java.util.Scanner;

public class Lesson03_Task17_met {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // вводим целое число n
        int n = sc.nextInt();

        String[][] arr = new String[n][n];   // создаем 2-мерный массив квадратный размером n х n

        for(int i = 0; i < arr.length/2+1; i++){        // заполняем верхнюю половину
            for (int j = 0; j < arr[i].length; j++){
                if((j < i) || (j >= (arr[i].length-i))) {
                    arr[i][j] = "0";
                } else {
                    arr[i][j] = "1";
                }
            }
        }

        for(int i = arr.length-1; i >= arr.length/2; i--){  // заполняем нижнюю половину матрицы
            for(int j = 0; j < arr[i].length; j++) {
                if ((j < (arr[i].length - 1 - i)) || (j > i)) {
                    arr[i][j] = "0";
                } else {
                    arr[i][j] = "1";
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {      // выводим все элементы массива на экран в форме квадрата
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

