package lesson_05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lesson05_Task23_met {
    public static void main(String[] args) {
        String string = "<!DOCTYPE HTML>\n" +
                "<html>\n" +
                " <head>\n" +
                "  <meta charset=\"utf-8\">\n" +
                "  <title>Тег P</title>\n" +
                " </head>\n" +
                " <body>\n" +
                "\n" +
                "  <p тжтогирннидшжтльльлроищд>Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diem \n" +
                "  nonummy nibh euismod tincidunt ut lacreet<p> dolore magna aliguam erat volutpat.</p>\n" +
                "  <pиршдипнщмпджргжпнапмлдпрдрои>Ut wisis enim ad minim<p id=”p1”>, veniam, quis <p id=”p1идрмплс”>,nostrud exerci tution ullamcorper \n" +
                "  suscipit lobortis nisl ut aliquip ex ea commodo consequat.</p>\n" +
                "\n" +
                " </body>\n" +
                "</html>";
        String strResult = string.replaceAll("<p[^>]*>", "<p>");
        System.out.println(strResult);
    }
}
