package lesson_07.Transport_classes;

public class Civil_aircrafts extends Air_transport{
    public int passenger_capacity;
    public boolean business_class_availabilty;

    public String getInfo() {
        return "Civil_aircrafts{" +
                "passenger_capacity=" + passenger_capacity +
                ", business_class_availabilty=" + business_class_availabilty +
                ", wingspan=" + wingspan +
                ", min_runway_length=" + min_runway_length +
                ", horse_power=" + horse_power +
                ", kWt_power=" + getKWTpower() +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public void canCarry(int passengerNumber) {
        if(passengerNumber <= passenger_capacity) {
            System.out.println("Самолет загружен");
        } else {
            System.out.println("Вам нужен самолет побольше.");
        }
    }
}
