package lesson_03;

import java.util.Scanner;

public class Lesson03_Task11_met {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(num == 0) {
            System.out.println("Число - 0!!");
        } else if(num<0) num = num*-1;

        int counter = 0;
        for (int i = 2; i <= num-1; i++) {
            if(num%i == 0) counter++;
        }
        if(num !=0 && counter == 0) System.out.println("Это простое число");
            else if(num != 0) System.out.println("Это составное число");
    }
}
