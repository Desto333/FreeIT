package lesson_05;

import java.util.Date;

public class Lesson05_Task21_met {
    public static void main(String[] args) {
        String string = "";                                     // create an empty String
        StringBuilder stringBuilder = new StringBuilder();      // create a StringBuilder object
        StringBuffer stringBuffer = new StringBuffer();         // create a StringBuffer object

        long strStart = System.currentTimeMillis();             // set exact start time of a cycle
        for (int i = 0; i < 200000; i++) {                      // perform  200000 additions to our string in a cycle
            string += "Ура!!!";
        }
        long strFinish = System.currentTimeMillis();            // set exact finish time of a cycle
        long resultTime = (strFinish-strStart);                 // calculate the difference between finish and start
        System.out.println(String.format("Сложение String заняло %d милисекунд", resultTime));      // print the result to console

        strStart = System.currentTimeMillis();                  // do the same operations with a StringBuilder object
        for (int i = 0; i < 200000; i++) {
            stringBuilder.append("Ура!!!");
        }
        strFinish = System.currentTimeMillis();
        resultTime = (strFinish-strStart);
        System.out.println(String.format("Сложение StringBuilder заняло %d милисекунд", resultTime));

        strStart = System.currentTimeMillis();                  // do the same operations with a StringBuffer object
        for (int i = 0; i < 200000; i++) {
            stringBuffer.append("Ура!!!");
        }
        strFinish = System.currentTimeMillis();
        resultTime = (strFinish-strStart);
        System.out.println(String.format("Сложение StringBuffer заняло %d милисекунд", resultTime));
        
    }
}
