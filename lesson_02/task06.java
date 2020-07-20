package lesson_02;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        
        if(a>=b) System.out.println(a);
            else System.out.println(b);
    }
}
