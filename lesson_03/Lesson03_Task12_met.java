package lesson_03;

/* Задание 12. Найдите сумму первых n целых чисел, которые делятся на 3. */

import java.util.Scanner;

public class Lesson03_Task12_met {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();       // вводим число n

        int sum = 0;        // сумма изначально равна 0
        int counter = 0;        // создаем счетчик, который изначально рвен 0
        int number = 0;     // переменная для чисел, которые будут проверяться на делимость на 3

        if(n == 0) System.out.println("Сумма равна " + sum);    // если n = 0? то и сумма = 0
            else {
                while(counter != n) {   // запускаем цикл, который будет работать до тех пор, пока счетчик не сравняется с числом n
                    number++;           // перебираем каждое целое число от 0 с шагом в 1
                    if(number%3 == 0) {     // если число делится без остатка на 3, то добавляем в счетчик 1 и прибавляем данное число к сумме
                        sum = sum + number;
                        counter++;
                    }
                }
        }
        if(n != 0) {
            System.out.println("Сумма равна " + sum);   // выводим сумму на экран
        }
    }
}
