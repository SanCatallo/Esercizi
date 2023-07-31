package javabasics._11;

public class TestProgrammers {

    public static void main(String[] args) {
        Programmer programmer1 = new Programmer("Samuele", 19, false);
        Programmer programmer2 = new Programmer("Vergil", 40, false);

        programmer1.drinkCofee();
        programmer1.printdetails();

        System.out.println("\n");

        programmer2.printdetails();
        programmer2.hasGlasses();
    }
}
