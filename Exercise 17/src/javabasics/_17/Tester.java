package javabasics._17;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Number of floor: ");
        int floorsNumber = scanner.nextInt();

        System.out.println("Address: ");
        String address = scanner.nextLine();

        System.out.println("Residents Names: ");
        String residentsInput = scanner.nextLine();
        String[] residentsNames = residentsInput.split(",");

        House house = new House(floorsNumber, address, residentsNames);

        System.out.println(house);
    }
}

