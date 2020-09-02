package lesson_07.Robot.hands;

public class SamsungHand implements IHand{
    private int price;

    public SamsungHand() {
        this.price = 600;
    }


    @Override
    public void upHand() {
        System.out.println("Рука Samsung вверху!");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
