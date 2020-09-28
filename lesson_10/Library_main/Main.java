package lesson_10.Library_main;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {

        Genre.printGenreList();
        System.out.println();

        Book book1 = new Book(1, "Дети капитана Гранта", Genre.createGenre("Adventures"));
        Book book2 = new Book(2, "Восточный экспресс", Genre.createGenre("Detectives"));
        Genre.printGenreList();
        Book book3 = new Book(3, "Человек-амфибия", Genre.genreList.get(1));
        Book book4 = new Book(4, "Французский детектив", Genre.genreList.get(2));

        Library library = new Library();

        library.addBookToLibrary(book1);
        library.addBookToLibrary(book2);
        library.addBookToLibrary(book3);
        library.addBookToLibrary(book4);

        System.out.println(library.getAllBooks() + "\n");

        library.removeBookFromLibrary(2);

        System.out.println(library.getAllBooks() + "\n");

        library.editBook(book1);

        System.out.println(library.getAllBooks() + "\n");

        Genre.printGenreList();

    }

}
