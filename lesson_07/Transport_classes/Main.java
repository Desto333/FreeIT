package lesson_07.Transport_classes;

public class Main{
    public static void main(String[] args) {
            Passenger_vehicles pv = new Passenger_vehicles();
            pv.horse_power = 100;
            pv.maxSpeed = 300;
            pv.manufacturer = "Toyota";
            pv.fuel_consumption = 15;
            pv.wheels_number = 4;
            pv.weight = 2000;
            pv.body_type = "Targa";
            pv.passengers_number = 2;
            System.out.println(pv.getInfo());
            pv.countDistance(4.5);

            Cargo_vehicles cv = new Cargo_vehicles();
            cv.horse_power = 150;
            cv.carrying_capacity = 3000;
            System.out.println(cv.getInfo());
            cv.canLoad(3500);
            System.out.println();

            Civil_aircrafts ca = new Civil_aircrafts();
            ca.passenger_capacity = 250;
            System.out.println(ca.getInfo());
            ca.canCarry(200);
            System.out.println();

            Military_aircrafts ma = new Military_aircrafts();
            System.out.println(ma.getInfo());
            ma.ejection_seat_availability = true;
            ma.number_of_missiles_onboard = 4;
            ma.launch();
            ma.launch();
            ma.launch();
            ma.launch();
            ma.launch();
            ma.emergencyEject();
            ma.emergencyEject();
        }
}
