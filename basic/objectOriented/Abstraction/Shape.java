package basic.objectOriented.Abstraction;

public abstract class Shape {

    // Abstract method to calculate area (to be implemented by subclasses)
    public abstract double calculateArea();

    // Concrete method (not abstract) can be common to all subclasses
    public void display() {
        System.out.println("This is a shape.");
    }

}
