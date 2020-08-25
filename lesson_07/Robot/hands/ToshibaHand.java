package lesson_07.Robot.hands;

public class ToshibaHand implements IHand {
    private int price;

    public ToshibaHand(int price) {
        this.price = price;
    }

    public ToshibaHand() {
    }


    @Override
    public void upHand() {
        System.out.println("Рука Toshiba поднята!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
