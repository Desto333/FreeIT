package lesson_02;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();

        if(num == 1 || (num%10 == 1 && num != 11)) System.out.println(num + " программист");
         else if((1<num && num<5) || (num%10 == 2 && num != 12) || (num%10 == 3 && num != 13) ||
                (num%10 == 4 && num != 14)) System.out.println(num + " программиста");
            else if(num>=0) System.out.println(num + " программистов");
    }
}
