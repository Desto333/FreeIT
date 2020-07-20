package lesson_02;

public class Task3_metod {
    public static void main(String[] args) {
        int s = 4500;
        int sec, min, hour, day, week = 0;

        sec = s%60;
        min = (s-sec)/60;
        System.out.println("A) " + min + " минут, " + sec + " секунд");

        int m = min%60;
        hour = (min - m) / 60;
        System.out.println("B) " + hour + " часов, " + m + " минут, " + sec + " секунд");

        day = hour / 24;
        int h = hour%24;
        System.out.println("C) " + day + " дней, " + h + " часов, " + m + " минут, " + sec + " секунд");

        week = day / 7;
        int d = day%7;
        System.out.println("D) " + week + " недель, " + d + " дней, " + h + " часов, " + m + " минут, " + sec + " секунд");
    }
}
