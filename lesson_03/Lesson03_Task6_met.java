package lesson_03;

/* Задание 6. Создайте число. Определите, является ли число трехзначным. Определите, является
ли его последняя цифра семеркой. Определите, является ли число четным. */

import java.util.Scanner;

public class Lesson03_Task6_met {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();         // создаем число

        if(num>0 && num/100>0 && num/100<10) {      // проверяем число на 3-хзначность
            System.out.println("Число трехзначное");
                } else if(num<0 && num/100<0 && num/100>-10) {
                    System.out.println("Число трехзначное");
                        } else System.out.println("Число не трехзначное");

        if(num%10 == 7 || num%10 == -7) {       // проверяем, является ли последняя цифра семеркой
            System.out.println("Последняя цифра числа является семеркой");
                } else System.out.println("Последняя цифра числа не является семеркой");

        if(num%2 == 0 && num != 0) System.out.println("Число является четным"); // проверяем, является ли число четным
            else if(num !=0) System.out.println("Число не является четным");
                else System.out.println("Число - ноль");
    }
}
