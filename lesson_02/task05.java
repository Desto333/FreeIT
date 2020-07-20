package lesson_02;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int posCount = 0;
        int negCount = 0;

        if(a>0) posCount++;
        if(a<0) negCount++;
        if(b>0) posCount++;
        if(b<0) negCount++;
        if(c>0) posCount++;
        if(c<0) negCount++;

        System.out.println("Количество положительных чисел: " + posCount + ". Количество отрицательных чисел: " + negCount);

    }
}
