package lesson_07.Robot.heads;

public class ToshibaHead implements IHead{
    private int price;

    public ToshibaHead() {
        this.price = 900;
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Toshiba");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
