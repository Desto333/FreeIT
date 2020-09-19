package lesson_10.Library_main;

public class Book {

    private int bookId;
    private String title;
    private Genre bookGenre;

    public Book(int bookId, String title, Genre bookGenre) {
        this.bookId = bookId;
        this.title = title;
        this.bookGenre = bookGenre;
    }

    public void setBookGenre(Genre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + bookId +
                ", title='" + title + '\'' +
                ", genre=" + bookGenre +
                '}' + "\n";
    }
}
