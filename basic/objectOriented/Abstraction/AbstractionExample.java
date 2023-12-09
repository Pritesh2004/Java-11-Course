package basic.objectOriented.Abstraction;

public class AbstractionExample {

    public static void main(String[] args) {
        // Creating objects of Circle and Rectangle
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Using abstract method to calculate area
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());

        // Using concrete method from the abstract class
        circle.display();
        rectangle.display();
    }
}
