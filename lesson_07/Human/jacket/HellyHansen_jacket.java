package lesson_07.Human.jacket;

public class HellyHansen_jacket implements Jacket {

    @Override
    public void putOn() {
        System.out.println("Куртка HellyHansen надета!");
    }

    @Override
    public void takeOff() {
        System.out.println("Куртка HellyHansen снята!");
    }
}
