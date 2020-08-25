package lesson_07.Human.shoes;

public class Bugatti_shoes implements Shoes {

    @Override
    public void putOn() {
        System.out.println("Туфли Bugatti надеты!");
    }

    @Override
    public void takeOff() {
        System.out.println("Туфли Bugatti сняты!");
    }
}
