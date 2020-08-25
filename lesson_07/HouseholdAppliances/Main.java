package lesson_07.HouseholdAppliances;

public class Main {
    public static void main(String[] args) {
        CellPhones cellphone1 = new CellPhones();
        cellphone1.plugin();
        HomeBasePhones homephone1 = new HomeBasePhones();
        homephone1.plugin();
        GasStove gasStove = new GasStove();
    }
}
