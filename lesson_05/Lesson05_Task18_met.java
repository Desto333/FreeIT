package lesson_05;

public class Lesson05_Task18_met {
    public static void main(String[] args) {
        String string = "void close()!? - закрывает вызывающий объект класса Formatter, что приводит к освобождению ресурсов, используемых объектом.";      // create a String object and fill it with a text
        char[] arr = {'.', ',', '-', '!', '?', ':', ';', '"', '(', ')'};        // create an array of punctuation marks
        char[] stringArr = string.toCharArray();        // convert our string into a char array
        int counter = 0;                        // create a counter and set it as 0
        for (int i = 0; i < stringArr.length; i++) {        // create a cycle to go through all the chars of our string
            for (int j = 0; j < arr.length; j++) {          // create another cycle to go through all the punctuation marks
                if(stringArr[i] == arr[j]) {                // compare the chars of our string with punctuation marks
                    counter++;                              // counter is incremented if a char of our string is equal to any of punctuation mark
                }
            }
        }
        System.out.println(String.format("В строке %d знаков препинания", counter));        // print out to console the number of punctuation marks in our string
    }
}
