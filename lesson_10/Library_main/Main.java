package lesson_10.Library_main;

public class Main {
    public static void main(String[] args) throws NoSuchMethodException {
//        Genre adventure = new Genre(1, "Adventures and quests");
//        Genre detective = new Genre(2, "Detectives");

        Book book1 = new Book(1, "Дети капитана Гранта", "adventure");
        Book book2 = new Book(2, "Восточный экспресс", "detective");
        Book book3 = new Book(3, "Человек-амфибия", "adventure");

        Library library = new Library();

        library.addBookToLibrary(book1);
        library.addBookToLibrary(book3);
        library.addBookToLibrary(book2);

        System.out.println(library.getAllBooks() + "\n");

        library.removeBook(2);

        System.out.println(library.getAllBooks() + "\n");

        library.editBook(book1);

        System.out.println(library.getAllBooks() + "\n");

    }

}
