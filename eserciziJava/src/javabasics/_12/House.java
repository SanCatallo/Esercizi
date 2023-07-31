package javabasics._12;
/*
Create a class called House that has 3 instance variables:
a string address
an int numberOfFloors
Define a constructor method for House that will print in console a message as soon as a House object is created
Define a testing class (e.g. Tester, Start or another reasonable name you prefer) with a main method where:
you declare two House variables house1 and house2
you create two House objects and assign them to the variables house1 and house2
 */
public class House {
    private String address;
    private int numberOfFloors;

    public House(String address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("A new house is being built in " + address + " and has " + numberOfFloors + " floors");
    }

}
