package lesson_07.Spacecraft;

import java.util.Spliterator;

public class Spaceport {
    public static void start(IStart obj) throws InterruptedException {
        if(!obj.isSystemReady()) {
            System.out.println("Предстартовая проверка провалена");
        } else {
            obj.startEngines();
            for (int i = 10; i > 0; i--) {
                System.out.println(i);
                Thread.sleep(500);
            }
            obj.launch();
        }


    }

    public static void main(String[] args) throws InterruptedException {
        start(new Shuttle());

        start(new SpaceX());
    }
}
