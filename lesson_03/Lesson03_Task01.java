package lesson_03;

public class Lesson03_Task01 {
    public static void main(String[] args) {
        double distance = 10;    // дистанция, которую бегун пробежал в первый день
        double totalDistance = distance;   // суммарная дистанция, после первого дня равна дистанции за первый день
        for (int i = 0; i < 6; i++) {     // цикл пройдет 6 раз - 6 дней, кроме первого, дистанция за который известна
            distance = distance*1.1;
            totalDistance = totalDistance + distance;

        }
        System.out.println("За 7 дней бегун пробежал " + totalDistance + " км");
    }
}
