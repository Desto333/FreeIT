package lesson_07.Spacecraft;

import java.util.Random;

public class Shuttle implements IStart{

    @Override
    public boolean isSystemReady() {
        Random random = new Random();
        int var = random.nextInt(11);
        if (var > 3) return true;
        else return false;
    }

    @Override
    public void startEngines() {
        System.out.println("Двигатели Шатла запущены. Все системы в норме.");
    }

    @Override
    public void launch() {
        System.out.println("Старт Шаттла");
    }
}
