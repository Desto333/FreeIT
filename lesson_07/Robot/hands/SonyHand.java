package lesson_07.Robot.hands;

public class SonyHand implements IHand{
    private int price;

    public SonyHand() {
        this.price = 650;
    }

    @Override
    public void upHand() {
        System.out.println("Рука Sony поднята!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
