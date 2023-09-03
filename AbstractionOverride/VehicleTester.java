package Esercizi.AbstractionOverride;

public class VehicleTester {
    public static void main(String[] args){
        car car = new car(4, 4, 10000);
        boat boat = new boat(40, 1000);

        car.showVehicleDetails();
        car.doVehicleSound();

        System.out.println("\n");

        boat.showVehicleDetails();
        boat.doVehicleSound();
        System.out.println("Boat Details: " + boat.getBoatSpeedWeight());
    }
}
