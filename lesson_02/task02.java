package lesson_02;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if((a+b)>c || (a+c)>b || (b+c)>a) System.out.println("Треугольник существует");
            else System.out.println("Треугольник не существует");
    }
}
