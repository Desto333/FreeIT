package lesson_12.Task34_met;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader brt = new BufferedReader(new FileReader("text2.txt"))) {
            String str;
            ArrayList<Double> fullList = new ArrayList<>();
            HashMap<Double, Integer> shortList = new HashMap<>();
            while ((str = brt.readLine()) != null) {
                StringTokenizer st = new StringTokenizer(str, " \n");
                while (st.hasMoreTokens()) {
                    String tempSt = st.nextToken();
                    if (tempSt.matches("^-?[0-9]*[.,]?[0-9]+")) {
                        fullList.add(Double.parseDouble(tempSt));
                        shortList.put(Double.parseDouble(tempSt), 0);
                    }
                }
            }

            double sum = 0;
            for (int i = 0; i < fullList.size(); i++) {
                System.out.print(fullList.get(i) + " ");
                sum = sum + fullList.get(i);
            }
            System.out.println("Сумма чисел равна: " + sum);

            for (Map.Entry entry : shortList.entrySet()) {
                System.out.print(entry.getKey() + " ");
            }

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка! Файл не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода!");
        }
    }
}
