package Esercizi.AbstractionOverride;

public class boat extends Vehicle{
    private double maxKnotsSpeed;
    private double boatKiloWeight;

    public boat(double speed, double weight){
        super("Boat", 0);
        this.maxKnotsSpeed = speed;
        this.boatKiloWeight = weight;
    }

    public String getBoatSpeedWeight(){
        return "\nBoat Speed: " + maxKnotsSpeed + "\nBoat Weight: " + boatKiloWeight;
    }

    @Override
    public void doVehicleSound() {
        System.out.println("Boat Sound: Vrrrrrrrrr ");
    }
}
