package lesson_02;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if(number > 0) {
            number = number + 1;
            System.out.println(number);
        }
        if(number < 0) {
            number = number - 2;
            System.out.println(number);
        }
        if(number == 0) {
            number = 10;
            System.out.println(number);
        }
    }
}
