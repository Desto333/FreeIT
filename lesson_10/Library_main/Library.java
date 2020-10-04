package lesson_10.Library_main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;


public class Library {

    public static HashMap<Integer, Book> bookList = new HashMap<>();

    public void addBookToLibrary(Book book) {
        bookList.put(bookList.size() + 1, book);
    }

    public HashMap<Integer, Book> getAllBooks() {
        return bookList;
    }

    public void removeBookFromLibrary(int id) {
        bookList.entrySet().removeIf(entry -> entry.getKey() == id);
    }

    public void editBook(Book book) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Введите новое название книги..");
            String newBookTitle = reader.readLine();
            book.setTitle(newBookTitle);

            while(true) {
                System.out.println("Если хотите выбрать из уже созданных жанров, нажмите 1. " +
                        "Если хотите создать новый жанр, нажмите 2");
                switch (Integer.parseInt(reader.readLine())) {
                    case 1: {
                        System.out.println("Выберите ID жанра книги.");
                        book.setBookGenre(Genre.genreList.get(Integer.parseInt(reader.readLine())));
                        return;
                    }
                    case 2: {
                        System.out.println("Введите название нового жанра.");
                        book.setBookGenre(Genre.createGenre(reader.readLine()));
                        return;
                    }
                    default: {
                        System.out.println("Неверный выбор.");
                    }
                }
            }
        }
}
