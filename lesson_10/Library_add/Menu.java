package lesson_10.Library_add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Menu {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    Library lib = new Library();

    public void start() throws IOException {
        while (true) {
            System.out.println("Выберите действие (цифры 0-4): " + "\n" +
                    "- Для вывода всех книг нажмите 1." + "\n" +
                    "- Для добавления книги нажмите 2." + "\n" +
                    "- Для удаления книги нажмите 3." + "\n" +
                    "- Для редактирования книги нажмите 4." + "\n" +
                    "- Для выхода из программы нажмите 0." + "\n");

            switch (Integer.parseInt(reader.readLine())) {
                case 1: {
                    showAllBooksMenu();
                    break;
                }
                case 2: {
                    addBookMenu();
                    break;
                }
                case 3: {
                    System.out.println("Введите номер id книги, которую вы хотите удалить: ");
                    removeBookMenu(Integer.parseInt(reader.readLine()));
                    break;
                }
                case 4: {
                    System.out.println("Введите номер id книги, которую вы хотите отредактировать: ");
                    editBookMenu(Integer.parseInt(reader.readLine()));
                    break;
                }
                case 0: {
                    return;
                }
                default: {
                    System.out.println("Сделайте корректный выбор." + "\n");
                }
            }

        }
    }

    public void showAllBooksMenu() throws IOException {
        System.out.println("Выберите, в каком порядке вывести список книг (цифры 1-3): " + "\n" +
                "- Для вывода в алфавитном порядке по возрастанию нажмите 1." + "\n" +
                "- Для вывода в алфавитном порядке по убыванию нажмите 2." + "\n" +
                "- Для вывода в порядке добавления нажмите 3." + "\n");
        while (true) {
            ArrayList<Book> tempList = lib.getAllBooks();
            switch (Integer.parseInt(reader.readLine())) {
                case 1: {
                    Collections.sort(tempList);
                    for (int i = 0; i < tempList.size(); i++) {
                        System.out.println(tempList.get(i));
                    }
                    break;
                }
                case 2: {
                    Collections.sort(tempList, Collections.reverseOrder());
                    for (int i = 0; i < tempList.size(); i++) {
                        System.out.println(tempList.get(i));
                    }
                    break;
                }
                case 3: {
                    for (int i = 0; i < tempList.size(); i++) {
                        System.out.println(tempList.get(i));
                    }
                    break;
                }
                default: {
                    System.out.println("Сделайте корректный выбор.");
                    break;
                }

            }
            break;
        }
    }

    public void addBookMenu() throws IOException {
        System.out.println("Для добавления новой книги в библиотеку введите следующие данные: " + "\n" +
                "id номер книги: ");
        int tempId = Integer.parseInt(reader.readLine());

        System.out.println("введите название книги: ");
        String tempTitle = reader.readLine();

        System.out.println("введите название жанра книги: ");
        String tempGenre = reader.readLine();

        lib.addBookToLibrary(new Book(tempId, tempTitle, tempGenre));
    }

    public void removeBookMenu(int bookId) {
        for (int i = 0; i < lib.list.size(); i++) {
            if (lib.list.get(i).getBookId() == bookId) {
                lib.removeBook(bookId);
                System.out.println("Книга с номером id " + bookId + " удалена." + "\n");
                break;
            }
        }
    }

    public void editBookMenu(int bookId) {
        for (int i = 0; i < lib.list.size(); i++) {
            if (lib.list.get(i).getBookId() == bookId) {
                lib.editBook(lib.list.get(i));
                System.out.println("Книга с номером id " + bookId + " отредактирована." + "\n");
                break;
            }
        }
    }
}
