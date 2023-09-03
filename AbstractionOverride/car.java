package Esercizi.AbstractionOverride;

public class car extends Vehicle{
    private int numberOfDoors;
    private double carprice;

    public car(int wheels, int doors, double price){
        super("Car", wheels);
        this.numberOfDoors = doors;
        this.carprice = price;
    }

    @Override
    public void showVehicleDetails(){
        super.showVehicleDetails();
        System.out.println("Number of Doors: " + numberOfDoors);
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Car Sound: Brooooom Brooooom");
    }

}
