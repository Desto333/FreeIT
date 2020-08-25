package lesson_07.Human.shoes;

import org.w3c.dom.ls.LSOutput;

public class Rieker_shoes implements Shoes {

    @Override
    public void putOn() {
        System.out.println("Ботинки Rieker надеты!!");
    }

    @Override
    public void takeOff() {
        System.out.println("Ботинки Rieker сняты!!");
    }
}
