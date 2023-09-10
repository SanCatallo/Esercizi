package Esercizi.DefaultMethodsOverride;

public class Tester {
    public static void main(String[] args) {
        try {
            // Create 4 new SmartphonePrice objects: 2 for Producer and 2 for Retail
            SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 500.0);
            SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 550.0);
            SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 600.0);
            SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 650.0);

            // Create 2 new Smartphone objects using the 4 newly created SmartphonePrice objects
            Smartphone smartphone1 = new Smartphone("Samsung", "Galaxy S20", 4000, producerPrice1, retailPrice1);
            Smartphone smartphone2 = new Smartphone("Apple", "iPhone 12", 3500, producerPrice2, retailPrice2);

            // Print details of the 2 newly created Smartphone objects
            System.out.println("Details of Smartphone 1:\n" + smartphone1);
            System.out.println("\nDetails of Smartphone 2:\n" + smartphone2);

            // Check if the first smartphone is equal to the second smartphone
            if (smartphone1.equals(smartphone2)) {
                System.out.println("\nThe two smartphones are equal.");
            } else {
                System.out.println("\nThe two smartphones are not equal.");
            }

            // Clone the second smartphone and print its details
            Smartphone clonedSmartphone = (Smartphone) smartphone2.clone();
            System.out.println("\nDetails of the Cloned Smartphone:\n" + clonedSmartphone);

            // Check if the second smartphone is equal to the newly cloned object
            if (smartphone2.equals(clonedSmartphone)) {
                System.out.println("\nThe second smartphone and the cloned smartphone are equal.");
            } else {
                System.out.println("\nThe second smartphone and the cloned smartphone are not equal.");
            }
        } catch (CloneNotSupportedException e) {
            // Print the stack trace of the exception and inform the user about the error
            e.printStackTrace();
            System.err.println("An error occurred while cloning the smartphone.");
        }
    }
}
