package lesson_10.Library_main;


import java.util.HashMap;
import java.util.Map;

public class Genre {

    public String genreName;
    public int genreId;
    public static HashMap<Integer, Genre> genreList = new HashMap<>();

    public Genre(String genreName) {
        this.genreName = genreName;
        this.genreId = genreList.size() + 1;
    }

    public static Genre createGenre(String genreName) {
        Genre genre = new Genre(genreName);
        genreList.put(genre.genreId, genre);
        return genre;
    }

    public static void printGenreList() {
        for (Map.Entry<Integer, Genre> map : genreList.entrySet()) {
            System.out.println(map.getKey() + ": " + map.getValue());
        }
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genre Name ='" + genreName + "', genre ID ='" + genreId + '\'' +
                '}';
    }
}
