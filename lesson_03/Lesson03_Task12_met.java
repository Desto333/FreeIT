package lesson_03;

import java.util.Scanner;

public class Lesson03_Task12_met {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        int counter = 0;
        int number = 0;

        if(n == 0) System.out.println("Сумма равна " + sum);
            else {
                while(counter != n) {
                    number++;
                    if(number%3 == 0) {
                        sum = sum + number;
                        counter++;
                    }
                }
        }

        if(n != 0) {
            System.out.println("Сумма равна " + sum);
        }
    }
}
