package lesson_07.Robot.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg() {
        this.price = 750;
    }

    @Override
    public void step() {
        System.out.println("Нога Sony делает шаг вперед!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
