package lesson_05;

import java.util.Random;
import java.util.Scanner;

public class Lesson05_TicTacToe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        String[][] canvas = new String[3][3];
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                canvas[i][j] = "_";
            }
        }
        for (int i = 0; i < canvas.length; i++) {
            for (int j = 0; j < canvas[i].length; j++) {
                System.out.print(canvas[i][j] + " ");
            }
            System.out.println();
        }
        String sideChoice;
        System.out.println("\nСыграем в крестики нолики? Выбирайте, Х или О .");
        int a;
        int b;

        while(true) {
        sideChoice = scanner.nextLine();
        int counter = 0;
        if (sideChoice.matches("[xXхХ]")) {
            System.out.println("\nВы выбрали крестики. Ваш первый ход. Введите координаты вашего первого крестика" +
                    " - два числа от 1 до 3 через Enter.");
            System.out.println("1-е число - номер строки, 2-е число - номер столбца.");
            while (true) {
                while (true) {                          // ход игрока
                    a = scanner.nextInt()-1;
                    b = scanner.nextInt()-1;
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
                            System.out.println("\nВы победили! Поздравляю!!! Спасибо за игру.");
                            return;
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
                        if (counter == 9) {                  // проверка на ничью
                            System.out.println("\nХодов больше нет! Ничья!!! Спасибо за игру.");
                            return;
                        }
                        System.out.println("\nХод компьютера.\n");
                        break;
                    } else {
                        System.out.println("\nВведите корректные координаты!!");
                    }
                }
                while (true) {                      // ход компьютера
                    a = random.nextInt(3);
                    b = random.nextInt(3);
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
                            System.out.println("\nВы проиграли! Сожалею! Спасибо за игру.");
                            return;
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
                        System.out.println("\nВаш ход. Введите координаты вашего крестика - два числа от 1 до 3" +
                                " через Enter.");
                        System.out.println("1-е число - номер строки, 2-е число - номер столбца.");
                        break;
                    }
                }
            }               // while-true стр 34
        }                   // if выбран Х 31 стр
        else if (sideChoice.matches("[0oOоО]")) {
            System.out.println("\nВы выбрали нолики. Компьютер ходит первым.");
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
        } else {
            System.out.println("Вы должны выбрать Х или О");
        }
    }
    }               // метод main
}                   // класс


