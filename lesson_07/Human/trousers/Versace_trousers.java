package lesson_07.Human.trousers;

public class Versace_trousers implements Trousers{
    @Override
    public void putOn() {
        System.out.println("Брюки Versace надеты!!!");
    }

    @Override
    public void takeOff() {
        System.out.println("Брюки Versace сняты!!!");
    }
}
