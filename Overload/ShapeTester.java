package Esercizi.Overload;

public class ShapeTester {
    public static void main(String[] args) {
        // Create 5 Shape objects using different constructors
        Shape shape = new Shape();
        Shape circle = new Shape(5.0);
        Shape square = new Shape(4, 4.0);
        Shape rectagle = new Shape(4, 5.0, 7.0);
        Shape triangle= new Shape(3, 3.0, 4.0, 5.0);

        String details1 = shape.getShapeDetails();
        String details2 = circle.getShapeDetails();
        String details3 = square.getShapeDetails();
        String details4 = rectagle.getShapeDetails();
        String details5 = triangle.getShapeDetails();


        System.out.println("Details of Shape:");
        System.out.println(details1);

        System.out.println("\nDetails of Circle:");
        System.out.println(details2);

        System.out.println("\nDetails of Square:");
        System.out.println(details3);

        System.out.println("\nDetails of Rectangle:");
        System.out.println(details4);

        System.out.println("\nDetails of Triangle:");
        System.out.println(details5);
    }
}
