package lesson_10.Library_add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Menu {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//    Library lib = new Library();     What is the difference between making all methods of Library class static and calling them in Menu class like Library.method()
    // and making methods of Library class not static and calling them through creating Library class object in Menu class (like lib.method())???
    // If this program works as expected without creating Library object, which way is preferable???

    public void start() {
        while (true) {
            System.out.println("Выберите действие (цифры 0-5): " + "\n" +
                    "- Для вывода всех книг нажмите 1." + "\n" +
                    "- Для добавления книги нажмите 2." + "\n" +
                    "- Для удаления книги нажмите 3." + "\n" +
                    "- Для редактирования книги нажмите 4." + "\n" +
                    "- Для вывода списка жанров книг нажмите 5." + "\n" +
                    "- Для выхода из программы нажмите 0." + "\n");

            int menuChoice = 0;
            try {
                menuChoice = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Вы сделали некорректный выбор в главном меню.");
            }
            switch (menuChoice) {
                case 1: {
                    if (Library.libList.isEmpty()) {
                        System.out.println("В библиотеке нет ни одной книги. Добавьте новую книгу." + "\n");
                        break;
                    } else {
                        showAllBooksMenu();
                        break;
                    }
                }
                case 2: {
                    Library.addBookToLibrary();
                    break;
                }
                case 3: {
                    System.out.println("Введите номер id книги, которую вы хотите удалить: ");
                    try {
                        Library.removeBookFromLibrary(Integer.parseInt(reader.readLine()));
                    } catch (IOException e) {
                        System.out.println("Вы ввели неверный ID книги для ее удаления.");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Введите номер id книги, которую вы хотите редактировать: ");
                    try {
                        Library.editBook(Integer.parseInt(reader.readLine()));
                    } catch (IOException e) {
                        System.out.println("Вы ввели неверный ID книги для ее редактирования.");
                    }
                    break;
                }
                case 5: {
                    Genre.printGenreList();
                    break;
                }
                case 0: {
                    return;
                }
                default: {
                    System.out.println("Введите число 0-4" + "\n");
                    break;
                }
            }
        }
    }

    public void showAllBooksMenu() {
        while (true) {
            System.out.println("Выберите, в каком порядке вывести список книг (цифры 1-3): " + "\n" +
                    "- Для вывода в алфавитном порядке А-Я нажмите 1." + "\n" +
                    "- Для вывода в обратном алфавитном порядке Я-А нажмите 2." + "\n" +
                    "- Для вывода в порядке добавления нажмите 3." + "\n");
            int menuChoice = 0;
            try {
                menuChoice = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Вы сделали некорректный выбор в меню вывода всех книг.");
            }
            switch (menuChoice) {
                case 1: {
                    Library.printAllBooksAlphabeticOrder();
                    break;
                }
                case 2: {
                    Library.printAllBooksReverseAlphabeticOrder();
                    break;
                }
                case 3: {
                    Library.printAllBooksEnterOrder();
                    break;
                }
                default: {
                    System.out.println("Введите число 1-3" + "\n");
                }
            }
            break;
        }
    }
}
