package lesson_07.Spacecraft;

import java.util.Random;

public class SpaceX implements IStart {

    @Override
    public boolean isSystemReady() {
        Random random = new Random();
        return random.nextBoolean();
    }

    @Override
    public void startEngines() {
        System.out.println("Двигатели SpaceX запущены. Все готово к полету!");
    }

    @Override
    public void launch() {
        System.out.println("SpaceX: ПОЕХАЛИ!!!");
    }
}
