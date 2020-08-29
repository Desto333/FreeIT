package lesson_09.AnnotationsTask;


import java.util.Objects;

    @Version(version = 1.0)         // annotate our class
    public class MyService {        //create our class MyService
        private String date;        //create private fields of our class
        private String author_name;
        private int size;

    public MyService(String date, String author_name, int size) {   // create constructor
        this.date = date;
        this.author_name = author_name;
        this.size = size;
    }

    public MyService() {        //create empty constructor

    }

    public String getDate() {       // create getters and setters
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {           // equals method is overridden
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyService myService = (MyService) o;
        return size == myService.size &&
                Objects.equals(date, myService.date) &&
                Objects.equals(author_name, myService.author_name);
    }

    @Override
    public int hashCode() {         //hashcode method is overridden
        return Objects.hash(date, author_name, size);
    }

        @Override
        public String toString() {      //toString method is overridden
            return "MyService{" +
                    "date='" + date + '\'' +
                    ", author_name='" + author_name + '\'' +
                    ", size=" + size +
                    '}';
        }

        private void thisClassInfo() {          //method returns the name of the class from which it is called
        System.out.println(this.getClass().getName());
    }
}
