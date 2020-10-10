package lesson_12.Task36_met;

import java.io.File;
import java.util.*;

public class Task36_met {
    public static void getFilesAndFolders(String path) {
        ArrayList<String> fileList = new ArrayList<>();
        ArrayList<String> folderList = new ArrayList<>();
        Queue<File> queue = new LinkedList<>();
        File folder = new File(path);
        Collections.addAll(queue, folder.listFiles());

        while (!queue.isEmpty()) {
            File currentFile = queue.remove();
            if (currentFile.isDirectory()) {
                Collections.addAll(queue, currentFile.listFiles());
                folderList.add(currentFile.getAbsolutePath());
            } else {
                fileList.add(currentFile.getAbsolutePath());
            }
        }

        System.out.println("Список файлов: ");
        for (int i = 0; i < fileList.size(); i++) {
            System.out.println(fileList.get(i));
        }

        System.out.println("\n" + "Список каталогов: ");
        for (int i = 0; i < folderList.size(); i++) {
            System.out.println(folderList.get(i));
        }
    }

    public static void main(String[] args) {
        getFilesAndFolders("C:\\Users\\User\\IdeaProjects\\FreeIT\\lesson_12");
    }
}
