package lesson_07.Transport_classes;

public class Cargo_vehicles extends Ground_transport{
    public int carrying_capacity;

    public String getInfo() {
        return "Cargo_vehicles{" +
                "carrying_capacity=" + carrying_capacity +
                ", wheels_number=" + wheels_number +
                ", fuel_consumption=" + fuel_consumption +
                ", horse_power=" + horse_power +
                ", kWt_power=" + getKWTpower() +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public void canLoad(int cargoWeight) {
        if(cargoWeight <= carrying_capacity) {
            System.out.println("Грузовик загружен");
        } else {
            System.out.println("Вам нужен грузовик побольше.");
        }
    }
}
