package lesson_12.Task33_met;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        try (BufferedReader brt = new BufferedReader(new FileReader("input.dat"))) {
            String str;
            int wordsNum = 0;
            int punctSignsNum = 0;
            while ((str = brt.readLine()) != null) {
                wordsNum = wordsNum + countWordsNum(str);
                punctSignsNum = punctSignsNum + countPunctSigns(str);
            }
            System.out.println("Количество слов в тексте: " + wordsNum);
            System.out.println("Количество знаков препинания в тексте: " + punctSignsNum);
        } catch (FileNotFoundException e) {
            System.out.println("Ошибка! Файл не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка ввода-вывода!");
        }
    }

    static int countPunctSigns(String string) {
        int result = 0;
        String[] charArr = string.split("");
        for (int i = 0; i < charArr.length; i++) {
            if (charArr[i].matches("\\p{P}")) {
                result++;
            }
        }
        return result;
    }

    static int countWordsNum(String string) {
        StringTokenizer st = new StringTokenizer(string, " \n");
        return st.countTokens();
    }
}
