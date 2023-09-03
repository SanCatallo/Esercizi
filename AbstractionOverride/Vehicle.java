package Esercizi.AbstractionOverride;

public abstract class Vehicle {
    private String type;
    private int numberOfWheels;

    public Vehicle(String type, int numberOfWheels){
        this.type = type;
        this.numberOfWheels = numberOfWheels;
    }
    public void showVehicleDetails(){
        System.out.println("Type: " + type);
        System.out.println("Numuer of Wheels: " + numberOfWheels);
    }
    public abstract void doVehicleSound();
}

