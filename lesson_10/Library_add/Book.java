package lesson_10.Library_add;


import java.util.LinkedHashMap;

public class Book implements Comparable {

    private int bookId;        //ссоздать список книг по примеру жанров, решить вопрос с bookId
    private String title;
    private Genre bookGenre;
    private static LinkedHashMap<Integer, Book> bookList = new LinkedHashMap<>();

    public Book(String title, Genre bookGenre) {
        this.bookId = bookList.size() + 1;
        this.title = title;
        this.bookGenre = bookGenre;
    }

    public void setBookGenre(Genre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public static Book createBook(String title, Genre bookGenre) {
        Book book = new Book(title, bookGenre);
        bookList.put(book.bookId, book);
        return book;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + bookId +
                ", title='" + title + '\'' +
                ", genre=" + bookGenre +
                '}' + "\n";
    }

    @Override
    public int compareTo(Object o) {
        return this.title.compareTo(((Book) o).getTitle());
    }
}
