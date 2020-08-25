package lesson_07.Transport_classes;

public class Passenger_vehicles extends Ground_transport{
    public String body_type;
    public int passengers_number;

    public String getInfo() {
        return "Passenger_vehicles{" +
                "body_type='" + body_type + '\'' +
                ", passengers_number=" + passengers_number +
                ", wheels_number=" + wheels_number +
                ", fuel_consumption=" + fuel_consumption +
                ", horse_power=" + horse_power +
                ", kWt_power=" + getKWTpower() +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public void countDistance(double time) {

        System.out.println("За время " + time + " ч, автомобиль "+ manufacturer +" \n" +
                "двигаясь с максимальной скоростью " + maxSpeed + " км/ч \n" +
                "проедет " + time*maxSpeed + " км  и израсходует " + countFuelConsumption(time) + " литров топлива. \n");
    }

    private double countFuelConsumption(double time) {
        return (double)time * maxSpeed / 100 * fuel_consumption;
    }
}
