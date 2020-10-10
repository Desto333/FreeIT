package lesson_10.Library_add;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.Map;

public class Genre {

    public String genreName;
    public int genreId;
    public static LinkedHashMap<Integer, Genre> genreList = new LinkedHashMap<>();

    public Genre(String genreName) {
        this.genreName = genreName;
        this.genreId = generateGenreId();
    }

    public static int generateGenreId() {
        return genreList.keySet().stream().max(Integer::compareTo).orElse(0) + 1;
    }

    public int getGenreId() {
        return genreId;
    }

    public static Genre createGenre(String genreName) {
        Genre genre = new Genre(genreName);
        genreList.put(genre.genreId, genre);
        return genre;
    }

    public static void printGenreList() {
        if (genreList.isEmpty()) {
            System.out.println("Список жанров пуст." + "\n");
        } else {
            for (Map.Entry<Integer, Genre> map : genreList.entrySet()) {
                System.out.println(map.getKey() + ": " + map.getValue() + "\n");
            }
        }
    }

    public static Genre defineGenre() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Genre genre = null;
        while (true) {
            System.out.println("Если хотите выбрать из уже созданных жанров, нажмите 1. " +
                    "Если хотите создать новый жанр, нажмите 2");
            int menuChoice = 0;
            try {
                menuChoice = Integer.parseInt(reader.readLine());
            } catch (IOException e) {
                System.out.println("Вы сделали неверный выбор в меню выбора жанра.");
            }
            switch (menuChoice) {
                case 1: {
                    if (genreList.isEmpty()) {
                        System.out.println("Список жанров пуст. Создайте новый жанр." + "\n");
                    } else {
                        System.out.println("Выберите ID жанра книги.");
                        try {
                            genre = genreList.get(Integer.parseInt(reader.readLine()));
                        } catch (IOException e) {
                            System.out.println("Вы выбрали некорректное ID жанра книги");
                        }
                        break;
                    }
                }
                case 2: {
                    System.out.println("Введите название нового жанра.");
                    try {
                        genre = createGenre(reader.readLine());
                    } catch (IOException e) {
                        System.out.println("Вы ввели некорректное название нового жанра");
                    }
                    break;
                }
                default: {
                    System.out.println("Неверный выбор.");
                    break;
                }
            }
            return genre;
        }
    }

    @Override
    public String toString() {
        return "Genre{" +
                "genre Name ='" + genreName + "', genre ID ='" + genreId + '\'' +
                '}';
    }

}
