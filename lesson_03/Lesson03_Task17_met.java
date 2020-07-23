package lesson_03;

/* Задание 17. Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е таким образом:
1 1 1 1 1
0 1 1 1 0
0 0 1 0 0
0 1 1 1 0
1 1 1 1 1
*/

public class Lesson03_Task17_met {
    public static void main(String[] args) {
        String[][] arr = new String[5][5];   // создаем 2-мерный массив размером 5х5

        for (int i = 0; i < arr.length; i++) {          // проходимся двойным циклом по всем элементам, нужные ячейки заполняем 0
            for (int j = 0; j < arr.length; j++) {
                if(i == 1 || i == 3){
                    if(j == 0 || j == 4) {
                        arr[i][j] = "0";
                    }
                } else if( i == 2){
                    if(j != 2) {
                        arr[i][j] = "0";
                    }
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {      // все остальные пустые ячейки заполняем 1
            for (int j = 0; j < arr.length; j++) {
                if(arr[i][j] == null){
                        arr[i][j] = "1";
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {      // выводим все элементы массива на экран в форме квадрата
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

