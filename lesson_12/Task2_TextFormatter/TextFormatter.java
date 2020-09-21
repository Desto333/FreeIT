package lesson_12.Task2_TextFormatter;

import java.io.*;
import java.util.StringTokenizer;

public class TextFormatter {

    static int countNumberOfWords(String string) {
        StringTokenizer st = new StringTokenizer(string, ".,!?:;()\"- \n");
        return st.countTokens();
    }

    static boolean containsPalindrome(String string) {
        boolean result = false;
        StringTokenizer st = new StringTokenizer(string, ".,!?:;()\"- \n");
        while (st.hasMoreTokens()) {
            String a = st.nextToken();
            StringBuffer sb = new StringBuffer(a);
            String b = new String(sb.reverse());
            if (a.equals(b) && a.length() > 2) {
                result = true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("text.txt"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("outputResult.txt"));

            String temp;
            StringBuilder sb = new StringBuilder();
            while ((temp = br.readLine()) != null) {
                sb.append(temp.trim().toLowerCase());
            }
            br.close();

            String text = new String(sb);
            StringTokenizer st = new StringTokenizer(text, ".!?");
            while (st.hasMoreTokens()) {
                String tempStr = st.nextToken();
                if (containsPalindrome(tempStr)) {
                    bw.write(tempStr + "\n");
                } else if (countNumberOfWords(tempStr) > 2 && countNumberOfWords(tempStr) < 6) {
                    bw.write(tempStr + "\n");
                }
            }
            bw.close();

        } catch (FileNotFoundException e) {
            System.out.println("Ошибка. Файл не найден!");
        } catch (IOException e) {
            System.out.println("Ошибка. Неверный ввод-вывод!");
        }


    }
}
