package lesson_03;

import java.util.Random;

public class Lesson03_Task10_met {
    public static void main(String[] args) {
            int x = (int)(Math.random()*6+10);
            x=15;
            System.out.println("Сгенерировано число " + x);
            long result = 1;
            for (int i = 1; i <= x; i++) {
                result = result*i;
            }
        System.out.println(result);

    }
}
