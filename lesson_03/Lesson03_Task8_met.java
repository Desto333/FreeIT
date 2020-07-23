package lesson_03;

/* Задание 8. Имеется целове число (задать с помощью Random rand = new Random(); int x =
rand.nextInt() ). Это число – количество денег в рублях. Вывести это число, добавив к
нему слово «рублей» в правильном падеже. */

import java.util.Random;


public class Lesson03_Task8_met {
    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(100000);     // границу установил для наглядности, а то совсем какие-то стремные числа выдавались

        if (num >= 0) {
            if (num == 1 || (num % 10 == 1 && num != 11 && num % 100 != 11)) System.out.println(num + " рубль");
            else if ((1 < num && num < 5) || (num % 10 == 2 && num != 12 && num % 100 != 12) || (num % 10 == 3 && num != 13 && num % 100 != 13) ||
                    (num % 10 == 4 && num != 14 && num % 100 != 14)) System.out.println(num + " рубля");
            else  System.out.println(num + " рублей");
        } else System.out.println("Должно быть положительное количество денег");
    }
}
