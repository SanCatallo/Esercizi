package Esercizi.DefaultMethodsOverride;

public class Tester {
    public static void main(String[] args) {
        try {
            SmartphonePrice producerPrice1 = new SmartphonePrice("Producer", 500.0);
            SmartphonePrice producerPrice2 = new SmartphonePrice("Producer", 550.0);
            SmartphonePrice retailPrice1 = new SmartphonePrice("Retail", 600.0);
            SmartphonePrice retailPrice2 = new SmartphonePrice("Retail", 650.0);

            Smartphone smartphone1 = new Smartphone("Samsung", "Galaxy S20", 4000, producerPrice1, retailPrice1);
            Smartphone smartphone2 = new Smartphone("Apple", "iPhone 12", 3500, producerPrice2, retailPrice2);

            System.out.println("Details of Smartphone 1:\n" + smartphone1);
            System.out.println("\nDetails of Smartphone 2:\n" + smartphone2);

            if (smartphone1.equals(smartphone2)) {
                System.out.println("\nThe two smartphones are equal.");
            } else {
                System.out.println("\nThe two smartphones are not equal.");
            }

            Smartphone clonedSmartphone = (Smartphone) smartphone2.clone();
            System.out.println("\nDetails of the Cloned Smartphone:\n" + clonedSmartphone);

            if (smartphone2.equals(clonedSmartphone)) {
                System.out.println("\nThe second smartphone and the cloned smartphone are equal.");
            } else {
                System.out.println("\nThe second smartphone and the cloned smartphone are not equal.");
            }
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            System.err.println("An error occurred while cloning the smartphone.");
        }
    }
}
