package lesson_12.Task1_Palindrome;

/* В исходном файле находятся слова, каждое слово на новой стороке. После
запуска программы должен создать файл, который будет содержать в себе
только палиндромы */

import java.io.*;

public class Main {
    public static void main(String[] args) {
        try
        {
            BufferedReader br = new BufferedReader(new FileReader("input.dat"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("output.dat"));

            String str;
            while((str = br.readLine()) != null) {
                StringBuilder sb = new StringBuilder(str);
                String revStr = new String(sb.reverse());
                if(str.equals(revStr) && str.length() > 2) {
                    bw.write(str + "\n");
                }
        }
            br.close();
            bw.close();
                
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
