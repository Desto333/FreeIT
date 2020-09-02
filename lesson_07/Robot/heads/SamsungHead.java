package lesson_07.Robot.heads;

public class SamsungHead implements IHead{
    private int price;

    public SamsungHead() {
        this.price = 950;
    }

    @Override
    public void speak() {
        System.out.println("Говорит голова Samsung");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
