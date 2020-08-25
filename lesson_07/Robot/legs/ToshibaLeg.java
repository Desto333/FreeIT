package lesson_07.Robot.legs;

public class ToshibaLeg implements ILeg {
    private int price;

    public ToshibaLeg(int price) {
        this.price = price;
    }

    public ToshibaLeg() {
    }


    @Override
    public void step() {
        System.out.println("Нога Toshiba делает шаг вперед!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
