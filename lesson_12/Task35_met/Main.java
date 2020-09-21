package lesson_12.Task35_met;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        try (DataOutputStream a = new DataOutputStream(new BufferedOutputStream(new
                FileOutputStream("hello.dat")))) {
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                a.writeInt(random.nextInt());
            }
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода!");
        }

        ArrayList<Integer> arr = new ArrayList<>();
        try {
            DataInputStream b = new DataInputStream(new BufferedInputStream(new FileInputStream("hello.dat")));
            int res = b.readInt();
            System.out.println(res);
            arr.add(res);
            while (b.available() > 0) {
                try {
                    res = b.readInt();
                    System.out.println(res);
                    arr.add(res);
                } catch (EOFException e) {
                    System.out.println("Какая-то ошибка!");
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            System.out.print("File not found");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода!");
        }

        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum = sum + arr.get(i);
        }
        System.out.println("Среднее арифметическое равно: " + sum / arr.size());
    }
}
