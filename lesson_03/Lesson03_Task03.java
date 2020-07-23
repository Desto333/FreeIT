package lesson_03;

/* Вычислить: 1+2+4+8+...+256 */

public class Lesson03_Task03 {
    public static void main(String[] args) {
        int sum = 0;        // начальная сумма = 0
        for (int i = 1; i <= 256; i=i*2) {       // с помощью цикла считаем сумму элементов последовательности от 1 до 256
            sum = sum + i;
        }
        System.out.println("Итоговая сумма: " + sum);   //выводим сумму на экран
    }
}
