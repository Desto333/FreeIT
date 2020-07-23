package lesson_03;

/* Задание 10. Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию). */

public class Lesson03_Task10_met {
    public static void main(String[] args) {
            int x = (int)(Math.random()*6+10);      // генерируем целое число в пределах от 10 до 15 и выводим его на экран
            System.out.println("Сгенерировано число " + x);
            long result = 1;
            for (int i = 1; i <= x; i++) {      // вычисляем факториал числа с помощью цикла
                result = result*i;
            }
        System.out.println(x + "! = " + result);     // выводим результат на экран

    }
}
