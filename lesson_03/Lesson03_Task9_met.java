package lesson_03;

/* Задание 9. Изменить пример с суммой чисел таким образом, чтобы рассчитывалась не сумма, а произведение, т.е. факториал числа. */

public class Lesson03_Task9_met {
    public static void main(String[] args) {
        int x = (int)(Math.random()*20);        // генерируем число
        System.out.println("Сгенерировано число: "+ x + "\n");  // выводим его на экран
        int count = 0;
        long fact = 1;
        while(count != x) {     // считаем факториал числа с помощью цикла
            count++;
            fact = fact*count;
        }
        if(x == 0) System.out.println("0! = 1");
            else System.out.println(count +"! = " + fact);
    }
}
