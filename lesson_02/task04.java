import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        if(a>0 && b<=0 && c<=0) System.out.println("Одно положительное число");
        if(a<=0 && b>0 && c<=0) System.out.println("Одно положительное число");
        if(a<=0 && b<=0 && c>0) System.out.println("Одно положительное число");
        if(a<=0 && b>0 && c>0) System.out.println("Два положительных числа");
        if(a>0 && b<=0 && c>0) System.out.println("Два положительных числа");
        if(a>0 && b>0 && c<=0) System.out.println("Два положительных числа");
        if(a>0 && b>0 && c>0) System.out.println("Три положительных числа");
    }
}
