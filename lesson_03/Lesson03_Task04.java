package lesson_03;

/* Составьте программу, вычисляющую A*B, не пользуясь операциейумножения. */

import java.util.Scanner;

public class Lesson03_Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        // вводим числа А и В
        int A = sc.nextInt();
        int B = sc.nextInt();

        int result = 0;         // результат изначально 0

        if(A >= 0 & B>= 0) {        // если А и В положительные или равны 0
            for (int i = 1; i <= A; i++) {  // с помощью цикла for добавляем в сумму А раз число В
            result = result + B;
            }
                } else if(A<0 & B>0) {  // если А или В отрицательные, сначала делаем его положительным, считаем произведение, как в случае с положительными, потом делаем результат отрицательными
                A=A*-1;
                for (int i = 1; i <= A; i++) {
                result = result + B;
                }
                result = result * -1;
                    } else if(A>0 & B<0) {
                    B=B*-1;
                    for (int i = 1; i <= A; i++) {
                    result = result + B;
                    }
                    result = result * -1;
                        } else if(A<0 & B<0) {  // если оба числа отрицательны, считаем произведение как для положительных чисел
                            A=A*-1;
                            B=B*-1;
                            for (int i = 1; i <= A; i++) {
                            result = result + B;
                            }
                        }
        System.out.println("А умножить на В получается: " + result);    //результат выводим на экран
    }
}
