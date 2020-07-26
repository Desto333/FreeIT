package lesson_03;

/* Напишите программу печати таблицы перевода расстояний из дюймов всантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см */

public class Lesson03_Task05 {
    public static void main(String[] args) {
        double cm = 2.54;
        for (int i = 1; i <= 20; i++) {
            System.out.println(i + " д = " + i*cm + " см");
        }
    }
}
