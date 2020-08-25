package lesson_07.Human.jacket;

public class Valentino_jacket implements Jacket {

    @Override
    public void putOn() {
        System.out.println("Куртка от Valentino надета!");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка от Valentino снята!");
    }
}
