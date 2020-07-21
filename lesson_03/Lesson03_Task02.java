package lesson_03;

public class Lesson03_Task02 {
    public static void main(String[] args) {
        int quantity = 1;       // кол-во клеток в стартовый момент
        for (int i = 0; i < 25; i=i+3) {        // цикл до 24 часов включительно с шагом в 3 часа
            System.out.println("Через " + i + " ч. будет " + quantity + " клет.");  // выводим количество клеток на экран
            quantity = quantity*2;              // каждый цикл увеличиваем кол-во клеток вдвое
        }
    }
}
