package vehicles;

import vehicles.Vehicles;

public class Main {
    public static void main(String[] args) {
        Vehicles car = Vehicles.V1;
        car.setColor("Red");
        car.setCost(10000);
        System.out.println(car.toString());

        Vehicles car2 = Vehicles.V2;
        car2.setCost(15000);
        car2.setColor("Black");
        System.out.println(car2.toString());
    }
}
