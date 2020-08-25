package lesson_07.Human;

import lesson_07.Human.jacket.Jacket;
import lesson_07.Human.shoes.Shoes;
import lesson_07.Human.trousers.Trousers;

public class Human {
    private String name;
    private Trousers trousers;
    private Shoes shoes;
    private Jacket jacket;

    public Human(String name, Trousers trousers, Shoes shoes, Jacket jacket) {
        this.name = name;
        this.trousers = trousers;
        this.shoes = shoes;
        this.jacket = jacket;
    }

    public Human() {
    }

    public void dress() {
        trousers.putOn();
        jacket.putOn();
        shoes.putOn();
    }

    public void undress() {
        trousers.takeOff();
        jacket.takeOff();
        shoes.takeOff();
    }
}
