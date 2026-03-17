class AreaCalculator {
    // Area of Square
    double area(double side) {
        return side * side;
    }
    // Area of Rectangle
    double area(double length, double width) {
        return length * width;
    }

    // Area of Circle
    double area(double radius) {
        return Math.PI * radius * radius;
    }
}
public class StaticPolymorphism {
    public static void main(String[] args) {
        AreaCalculator calc = new AreaCalculator();
        System.out.println("Square Area: " + calc.area(5));        // square
        System.out.println("Rectangle Area: " + calc.area(4, 6));  // rectangle
        System.out.println("Circle Area: " + calc.area(3.0));     // circle
    }
}