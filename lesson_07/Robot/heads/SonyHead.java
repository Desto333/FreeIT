package lesson_07.Robot.heads;

public class SonyHead implements IHead{
    private int price;

    public SonyHead() {
        this.price = 1000;
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
