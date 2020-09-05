package lesson_10.Library_add;

public class Book implements Comparable{

    private int bookId;
    private String title;
    private String bookGenre;   // как сделать как в задании методички? чтобы по указанию genreId вызывался соответствующий объект Genre

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(String bookGenre) {
        this.bookGenre = bookGenre;
    }

    public Book(int bookId, String title, String bookGenre) {
        this.bookId = bookId;
        this.title = title;
        this.bookGenre = bookGenre;
    }

    @Override
    public String toString() {
        return "\n" + "Book{" +
                "id=" + bookId +
                ", title='" + title + '\'' +
                ", genre=" + bookGenre +
                '}' + "\n" ;
    }

    @Override
    public int compareTo(Object o) {
        return this.title.compareTo(((Book)o).getTitle());
    }
}
