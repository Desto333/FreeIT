package lesson_03;

public class Lesson03_Task9_met {
    public static void main(String[] args) {
        int x = (int)(Math.random()*20);
        System.out.println("Сгенерировано число: "+ x + "\n");
        int count = 0;
        long fact = 1;
        while(count != x) {
            count++;
            fact = fact*count;
        }
        if(x == 0) System.out.println("0! = 1");
            else System.out.println(count +"! = " + fact);
    }
}
