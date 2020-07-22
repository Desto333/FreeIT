package lesson_03;

import java.util.Scanner;

public class Lesson03_Task7_met {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();   // задаем сторону прямоугольника а
        int b = sc.nextInt();   // задаем сторону прямоугольника b
        int r = sc.nextInt();   // задаем радиус картонки r

        /* для того, чтобы картонка закрывала отверстие, необходимо, чтобы ее радиус был больше либо равен половины
        диагонали этого отверстия */

        double d = Math.sqrt(a*a + b*b);    //вычисляем длину диагонали по теореме Пифагора

        if(r >= d/2) System.out.println("Картонка закроет отверстие");
            else System.out.println("Картонка не закроет отверстие");
    }
}
