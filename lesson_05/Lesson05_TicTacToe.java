package lesson_05;

import java.util.Random;
import java.util.Scanner;

public class Lesson05_TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);                   // create new Scanner object
        Random random = new Random();                               // create new Random object
        String[][] canvas = new String[3][3];                       // create 3x3 array as our game field
        for (int i = 0; i < canvas.length; i++) {                   // fill all array cells with "_" symbol to indicate an empty cell
            for (int j = 0; j < canvas[i].length; j++) {
                canvas[i][j] = "_";
            }
        }
        for (int i = 0; i < canvas.length; i++) {                   // print out empty game field
            for (int j = 0; j < canvas[i].length; j++) {
                System.out.print(canvas[i][j] + " ");
            }
            System.out.println();
        }
        String sideChoice;                                          // create a String to store our choice of X or O
        System.out.println("\nСыграем в крестики нолики? Выбирайте, Х или О .");        // offer to choose X or O
        int a;                                                  // create variables to enter the coordinates of game field cells
        int b;

        while(true) {                                           // create outer while cycle
            sideChoice = scanner.nextLine();                    // enter player's choice to play using X or O
            int counter = 0;                                    // create a counter for the number of turns played
                if (sideChoice.matches("[xXхХ]")) {         // if player chooses to play with X (russian or english letters, lower or upper cases)
                    System.out.println("\nВы выбрали крестики. Ваш первый ход. Введите координаты вашего первого крестика" +            // as player has chosen X, he makes the 1st turn
                    " - два числа от 1 до 3 через Enter.");
                    System.out.println("1-е число - номер строки, 2-е число - номер столбца.");
                        while (true) {                              // create 1st inner while cycle to loop the change of turns between X and O
                            while (true) {                          // create 2nd inner cycle to loop player's input of coordinates and checking for it's correctness
                                a = scanner.nextInt()-1;            // player enters coordinates from console
                                b = scanner.nextInt()-1;
                                if (a >= 0 && a <= 2 && b >= 0 && b <= 2 && canvas[a][b].equals("_")) {     // if player's input is correct and the cell is empty
                                    canvas[a][b] = "X";                                             // the cell gets filled with X
                                    counter++;                                                      // counter of turns is incremented by 1
                                    for (int i = 0; i < canvas.length; i++) {                       // print out of changed game field
                                        for (int j = 0; j < canvas[i].length; j++) {
                                            System.out.print(canvas[i][j] + " ");
                                        }
                                        System.out.println();
                                    }
                                    if(canvas[0][0].equals("X") && canvas[0][1].equals("X") && canvas[0][2].equals("X")) {      // checking for possible win of X
                                        System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");                    // win message
                                        return;                                                                                 // stop the program, end of the game
                                    }
                                    if(canvas[1][0].equals("X") && canvas[1][1].equals("X") && canvas[1][2].equals("X")) {
                                        System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                        return;
                                    }
                                    if(canvas[2][0].equals("X") && canvas[2][1].equals("X") && canvas[2][2].equals("X")) {
                                        System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                        return;
                                    }
                                    if(canvas[0][0].equals("X") && canvas[1][0].equals("X") && canvas[2][0].equals("X")) {
                                        System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                        return;
                                    }
                                    if(canvas[0][1].equals("X") && canvas[1][1].equals("X") && canvas[2][1].equals("X")) {
                                        System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                        return;
                                    }
                                    if(canvas[0][2].equals("X") && canvas[1][2].equals("X") && canvas[2][2].equals("X")) {
                                        System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                        return;
                                    }
                                    if(canvas[0][0].equals("X") && canvas[1][1].equals("X") && canvas[2][2].equals("X")) {
                                        System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                        return;
                                    }
                                    if(canvas[2][0].equals("X") && canvas[1][1].equals("X") && canvas[0][2].equals("X")) {
                                        System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                        return;
                                    }
                                    if (counter == 9) {                                                                     // checking for a possible draw (if still no lines, columns or diagonals are completed with X and the number of turns is 9 - it's a draw)
                                        System.out.println("\nХодов больше нет! Ничья!!! Спасибо за игру.");                // draw message
                                        return;                                                                             // stop the program, end of the game
                                    }
                                    System.out.println("\nХод компьютера.\n");                                              // pass the turn to computer message
                                    break;                                                                                  // after the player made his turn, did not win, the game is not drawn, program leaves 2nd inner while cycle
                                } else {                                                                                    //  if player's input at line 38 is incorrect, a message is displayed and the program goes to the beginning of 2nd inner while cycle
                                    System.out.println("\nВведите корректные координаты!!");
                                }
                            }
                            while (true) {                                                                               // after the program left 2nd inner cycle at line 84, it enters another 2nd inner while cycle to loop computer turn and checking for its correctness
                                a = random.nextInt(3);                                                              // computer randomly chooses the coordinates of a cell for it's turn
                                b = random.nextInt(3);
                                if (a >= 0 && a <= 2 && b >= 0 && b <= 2 && canvas[a][b].equals("_")) {                     // check the correctness of the coordinates as at line 38
                                    canvas[a][b] = "O";                                                                 // if coordinates are correct, the cell is filled with O
                                    counter++;                                                                          // turn counter is incremented by 1
                                    for (int i = 0; i < canvas.length; i++) {                                               // print out of changed game field
                                        for (int j = 0; j < canvas[i].length; j++) {
                                            System.out.print(canvas[i][j] + " ");
                                        }
                                        System.out.println();
                                    }
                                    if(canvas[0][0].equals("O") && canvas[0][1].equals("O") && canvas[0][2].equals("O")) {      // checking for possible win of O
                                        System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");                        // loose message
                                        return;                                                                                 // stop the program, end of the game
                                    }
                                    if(canvas[1][0].equals("O") && canvas[1][1].equals("O") && canvas[1][2].equals("O")) {
                                        System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                        return;
                                    }
                                    if(canvas[2][0].equals("O") && canvas[2][1].equals("O") && canvas[2][2].equals("O")) {
                                        System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                        return;
                                    }
                                    if(canvas[0][0].equals("O") && canvas[1][0].equals("O") && canvas[2][0].equals("O")) {
                                        System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                        return;
                                    }
                                    if(canvas[0][1].equals("O") && canvas[1][1].equals("O") && canvas[2][1].equals("O")) {
                                        System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                        return;
                                    }
                                    if(canvas[0][2].equals("O") && canvas[1][2].equals("O") && canvas[2][2].equals("O")) {
                                        System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                        return;
                                    }
                                    if(canvas[0][0].equals("O") && canvas[1][1].equals("O") && canvas[2][2].equals("O")) {
                                        System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                        return;
                                    }
                                    if(canvas[2][0].equals("O") && canvas[1][1].equals("O") && canvas[0][2].equals("O")) {
                                        System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                        return;
                                    }
                                    System.out.println("\nВаш ход. Введите координаты вашего крестика - два числа от 1 до 3" +          // pass the turn to player message
                                            " через Enter.");
                                    System.out.println("1-е число - номер строки, 2-е число - номер столбца.");
                                    break;                                                                                  // after the computer made it's turn, did not win, program leaves 2nd inner while cycle
                                }
                            }
                        }
                    }
        else if (sideChoice.matches("[0oOоО]")) {                               // if player chooses to play with 0 (0, russian or english letters, lower or upper cases)
            System.out.println("\nВы выбрали нолики. Компьютер ходит первым.");         // if player chooses to play with O, the program code is pretty much the same, except that in this case computer makes the 1st turn
                while(true) {
                    while(true) {
                        a = random.nextInt(3);
                        b = random.nextInt(3);
                        if (a >= 0 && a <= 2 && b >= 0 && b <= 2 && canvas[a][b].equals("_")) {
                            canvas[a][b] = "X";
                            counter++;
                            for (int i = 0; i < canvas.length; i++) {
                                for (int j = 0; j < canvas[i].length; j++) {
                                    System.out.print(canvas[i][j] + " ");
                                }
                                System.out.println();
                            }
                            if(canvas[0][0].equals("X") && canvas[0][1].equals("X") && canvas[0][2].equals("X")) {
                                System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                return;
                            }
                            if(canvas[1][0].equals("X") && canvas[1][1].equals("X") && canvas[1][2].equals("X")) {
                                System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                return;
                            }
                            if(canvas[2][0].equals("X") && canvas[2][1].equals("X") && canvas[2][2].equals("X")) {
                                System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                return;
                            }
                            if(canvas[0][0].equals("X") && canvas[1][0].equals("X") && canvas[2][0].equals("X")) {
                                System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                return;
                            }
                            if(canvas[0][1].equals("X") && canvas[1][1].equals("X") && canvas[2][1].equals("X")) {
                                System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                return;
                            }
                            if(canvas[0][2].equals("X") && canvas[1][2].equals("X") && canvas[2][2].equals("X")) {
                                System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                return;
                            }
                            if(canvas[0][0].equals("X") && canvas[1][1].equals("X") && canvas[2][2].equals("X")) {
                                System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                return;
                            }
                            if(canvas[2][0].equals("X") && canvas[1][1].equals("X") && canvas[0][2].equals("X")) {
                                System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                                return;
                            }
                            if (counter == 9) {                  // проверка на ничью
                                System.out.println("\nХодов больше нет! Ничья!!! Спасибо за игру.");
                                return;
                            }
                            System.out.println("\nВаш ход. Введите координаты вашего нолика - два числа от 1 до 3" +
                                    " через Enter.");
                            System.out.println("1-е число - номер строки, 2-е число - номер столбца.");
                            break;
                        }
                    }
                    while(true) {
                        a = scanner.nextInt()-1;
                        b = scanner.nextInt()-1;
                        if (a >= 0 && a <= 2 && b >= 0 && b <= 2 && canvas[a][b].equals("_")) {
                            canvas[a][b] = "O";
                            counter++;
                            for (int i = 0; i < canvas.length; i++) {
                                for (int j = 0; j < canvas[i].length; j++) {
                                    System.out.print(canvas[i][j] + " ");
                                }
                                System.out.println();
                            }
                            if(canvas[0][0].equals("O") && canvas[0][1].equals("O") && canvas[0][2].equals("O")) {
                                System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                return;
                            }
                            if(canvas[1][0].equals("O") && canvas[1][1].equals("O") && canvas[1][2].equals("O")) {
                                System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                return;
                            }
                            if(canvas[2][0].equals("O") && canvas[2][1].equals("O") && canvas[2][2].equals("O")) {
                                System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                return;
                            }
                            if(canvas[0][0].equals("O") && canvas[1][0].equals("O") && canvas[2][0].equals("O")) {
                                System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                return;
                            }
                            if(canvas[0][1].equals("O") && canvas[1][1].equals("O") && canvas[2][1].equals("O")) {
                                System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                return;
                            }
                            if(canvas[0][2].equals("O") && canvas[1][2].equals("O") && canvas[2][2].equals("O")) {
                                System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                return;
                            }
                            if(canvas[0][0].equals("O") && canvas[1][1].equals("O") && canvas[2][2].equals("O")) {
                                System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                return;
                            }
                            if(canvas[2][0].equals("O") && canvas[1][1].equals("O") && canvas[0][2].equals("O")) {
                                System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                                return;
                            }
                            System.out.println("\nХод компьютера.\n");
                            break;
                        } else {
                            System.out.println("\nВведите корректные координаты!!");
                        }
                    }
                }
        } else {                                                    // if the choice at line 28 is incorrect, we get the message to make a correct choice. Program goes back to line 28
            System.out.println("Вы должны выбрать Х или О");
        }
    }
    }
}


