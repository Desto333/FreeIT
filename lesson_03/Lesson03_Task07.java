package lesson_03;

/* Напишите программу, определяющую сумму всех нечетных чисел от 1до 99 */

public class Lesson03_Task07 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 99; i+=2) {
            sum = sum + i;
        }
        System.out.println("Сумма нечетных чисел от 1 до 99 равна " + sum);
    }
}
