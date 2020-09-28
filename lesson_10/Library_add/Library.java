package lesson_10.Library_add;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;


public class Library {

    public static LinkedHashMap<Integer, Book> libList = new LinkedHashMap<>();
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void printAllBooksAlphabeticOrder() {
        libList.entrySet().stream().sorted(Map.Entry.<Integer, Book>comparingByValue()).forEach(System.out::println);
    }

    public static void printAllBooksReverseAlphabeticOrder() {
        libList.entrySet().stream().sorted(Map.Entry.<Integer, Book>comparingByValue().reversed()).forEach(System.out::println);
    }

    public static void printAllBooksEnterOrder() {
        libList.entrySet().forEach(System.out::println);
    }

    public static void addBookToLibrary() {
        System.out.println("Для добавления новой книги в библиотеку введите следующие данные: " + "\n");
        System.out.println("введите название книги: ");
        String tempTitle = null;
        try {
            tempTitle = reader.readLine();
        } catch (IOException e) {
            System.out.println("Некорректный ввод названия книги!");
            ;
        }
        System.out.println("определите жанр книги: ");
        Genre tempGenre = Genre.defineGenre();
        Book book = Book.createBook(tempTitle, tempGenre);
        libList.put(book.getBookId(), book);
    }


    public static void removeBookFromLibrary(int id) {
        libList.entrySet().removeIf(entry -> entry.getKey() == id);
    }

    public static void editBook(int bookId) {
        System.out.println("Введите новое название книги..");
        String newBookTitle = null;
        try {
            newBookTitle = reader.readLine();
        } catch (IOException e) {
            System.out.println("Вы ввели некорректное название книги при редактировании.");
        }
        for (Map.Entry<Integer, Book> entry : libList.entrySet()) {
            if (entry.getKey() == bookId) {
                entry.getValue().setTitle(newBookTitle);
                entry.getValue().setBookGenre(Genre.defineGenre());
            }
        }
    }
}
