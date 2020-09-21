package lesson_12.Task3_Censored;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            BufferedReader brt = new BufferedReader(new FileReader("text.txt"));
            BufferedReader brbl = new BufferedReader(new FileReader("blacklist.txt"));

            String text;
            String blacklist;
            ArrayList<String> blist = new ArrayList<>();
            int counter = 0;
            int lineNumber = 0;

            while ((blacklist = brbl.readLine()) != null) {
                blist.add(blacklist);
            }
            brbl.close();

            while ((text = brt.readLine()) != null) {
                lineNumber++;
                for (int i = 0; i < blist.size(); i++) {
                    if (text.toLowerCase().contains(blist.get(i))) {
                        System.out.println("CENSORED!!!: строка номер " + lineNumber + ": " + text);
                        counter++;
                    }
                }
            }

            if (counter == 0) {
                System.out.println("Текст прошел цензуру. Претензий не имеется.");
            } else {
                System.out.println("\n" + "Количество строк для корректировки: " + counter);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
