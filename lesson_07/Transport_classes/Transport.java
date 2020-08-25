package lesson_07.Transport_classes;

public abstract class Transport {
    public int horse_power;
    public int maxSpeed;
    public int weight;
    public String manufacturer;

    public double getKWTpower() {
        return horse_power * 0.74;
    }
}
