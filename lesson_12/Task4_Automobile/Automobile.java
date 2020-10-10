package lesson_12.Task4_Automobile;

import java.io.Serializable;

public class Automobile implements Serializable {
    String model;
    int maxSpeed;
    int price;

    public Automobile(String model, int maxSpeed, int price) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Automobile{" +
                "model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
