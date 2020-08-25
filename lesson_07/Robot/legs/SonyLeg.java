package lesson_07.Robot.legs;

public class SonyLeg implements ILeg {
    private int price;

    public SonyLeg(int price) {
        this.price = price;
    }

    public SonyLeg() {
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
