package Esercizi.Overload;

public class Shape {
    private String shapeName;
    private int numberOfEdges;

    public Shape(){
        System.out.println("Shape object created");
        this.shapeName = "Undefined Shape";
    }
    public Shape(double radius){
        System.out.println("Circle Created");
        this.shapeName = "Circle";
        this.numberOfEdges = 0;
    }
    public  Shape(int edges, double edgeLength){
        System.out.println("Square Created");
        this.shapeName = "Square";
        this.numberOfEdges = edges;
    }
    public  Shape(int edges, double e1, double e2){
        System.out.println("Rectangle Created");
        this.shapeName = "Rectangle";
        this.numberOfEdges = edges;
    }
    public  Shape(int edges, double e1, double e2, double e3){
        System.out.println("Triangle Created");
        this.shapeName = "Triangle";
        this.numberOfEdges = edges;
    }
    public String getShapeDetails() {
        return "\nShape: " + shapeName + "\nNumber of Edges: " + numberOfEdges;
    }
}
