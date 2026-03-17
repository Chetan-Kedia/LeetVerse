abstract class Shape {
    Shape() {
        System.out.println("Shape constructor called");
    }
    void disp() {
        System.out.println("This is a shape");
    }
    abstract void draw();
}

class Circle extends Shape {

    Circle() {
        System.out.println("Circle constructor called");
    }
    void draw() {
        System.out.println("Drawing circle");
    }
}

class Triangle extends Shape {

    Triangle() {
        System.out.println("Triangle constructor called");
    }
    void draw() {
        System.out.println("Drawing triangle");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Shape s = new Circle();
        s.disp();
        s.draw();
        s = new Triangle();
        s.disp();
        s.draw();
    }
}