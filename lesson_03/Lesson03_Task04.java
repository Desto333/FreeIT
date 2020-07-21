package lesson_03;

import java.util.Scanner;

public class Lesson03_Task04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();

        int result = 0;

        if(A >= 0 && B>= 0) {
            for (int i = 1; i <= A; i++) {
            result = result + B;
            }
                } else if(A<0 && B>0) {
                A=A*-1;
                for (int i = 1; i <= A; i++) {
                result = result + B;
                }
                result = result * -1;
                    } else if(A>0 && B<0) {
                    B=B*-1;
                    for (int i = 1; i <= A; i++) {
                    result = result + B;
                    }
                    result = result * -1;
                        } else if(A<0 && B<0) {
                            A=A*-1;
                            B=B*-1;
                            for (int i = 1; i <= A; i++) {
                            result = result + B;
                            }
                        }
        System.out.println("А умножить на В получается: " + result);
    }
}
