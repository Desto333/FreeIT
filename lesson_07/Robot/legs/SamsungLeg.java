package lesson_07.Robot.legs;

public class SamsungLeg implements ILeg{
    private int price;

    public SamsungLeg() {
        this.price = 700;
    }

    @Override
    public void step() {
        System.out.println("Нога Samsung делает шаг вперед!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
