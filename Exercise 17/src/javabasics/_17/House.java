package javabasics._17;

import java.util.Arrays;

public class House {
    private int floorsNumber;
    private String address;
    private String[] residentsNames;

    public House(int floorsNumber, String address, String[] residentsNames){
        this.floorsNumber = floorsNumber;
        this.address = address;
        this.residentsNames = residentsNames;
    }
    public int getFloorsNumber(){
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }

    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }

    public String toString() {
        return String.format("\nHouse details:" +
                "\nFloors number: " + floorsNumber +
                "\nAddress: " + address +
                "\nResidents: " + Arrays.toString(residentsNames));
    }
}
