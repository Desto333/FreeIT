package lesson_07.Transport_classes;

public class Military_aircrafts extends Air_transport {
    public boolean ejection_seat_availability;
    public int number_of_missiles_onboard;

    public String getInfo() {
        return "Military_aircrafts{" +
                "ejection_seat_availability=" + ejection_seat_availability +
                ", number_of_missiles_onboard=" + number_of_missiles_onboard +
                ", wingspan=" + wingspan +
                ", min_runway_length=" + min_runway_length +
                ", horse_power=" + horse_power +
                ", kWt_power=" + getKWTpower() +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", manufacturer='" + manufacturer + '\'' +
                '}';
    }

    public void launch() {
        if(number_of_missiles_onboard != 0) {
            System.out.println("Ракета пошла...");
            number_of_missiles_onboard--;
        } else {
            System.out.println("Боеприпасы отсутствуют");
        }
    }

    public void emergencyEject() {
        if(ejection_seat_availability) {
            System.out.println("Катапультирование прошло успешно");
            ejection_seat_availability = false;
        } else {
            System.out.println("У вас нет такой системы");
        }
    }
}
