package lesson_07.Human.trousers;

public class Levis_trousers implements Trousers {

    @Override
    public void putOn() {
        System.out.println("Джинсы Levis надеты!!!");
    }

    @Override
    public void takeOff() {
        System.out.println("Джинсы Levis сняты!!!");
    }
}
