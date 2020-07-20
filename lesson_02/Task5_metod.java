package lesson_02;

import java.util.Scanner;

public class Task5_metod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int fst = num%10;
        int sec = (num%100 - num%10)/10;
        int thd = (num%1000 - num%100)/100;
        int frth = (num - num%1000)/1000;

        if(fst!=sec && fst!=thd && fst!=frth && sec!=thd && sec!=frth && thd!=frth) {
            System.out.println("Все цифры числа различны");
        } else System.out.println("В числе есть одинаковые цифры");
    }
}
