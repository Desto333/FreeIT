package lesson_10.Library_add;

import java.util.ArrayList;
import java.util.Scanner;


public class Library {

    ArrayList<Book> list = new ArrayList<>();

    public void addBookToLibrary(Book book) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getBookId() == book.getBookId()) {
                System.out.println("Ошибка! ID должен быть уникальным, такой id уже существует!");
                return;
            }
        }
        list.add(book);
    }

    public ArrayList<Book> getAllBooks() {
        return list;
    }

    public void removeBook(int id) {
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getBookId() == id) {
                list.remove(i);
                break;
            }
        }
    }

    public void editBook(Book book) {
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Введите новые данные книги: id..");
                    String tempStr = sc.nextLine();
                    int newId = Integer.parseInt(tempStr);
                    for (int i = 0; i < list.size(); i++) {
                        if (list.get(i).getBookId() == newId) {
                            System.out.println("Ошибка! ID должен быть уникальным, такой id уже существует!");
                        }

                    book.setBookId(newId);

            }

            System.out.println("..название книги..");
            String newBookTitle = sc.nextLine();
            book.setTitle(newBookTitle);

            System.out.println("..жанр.");
            String newBookGenre = sc.nextLine();
            book.setBookGenre(newBookGenre);
            break;
            }
        }
}
