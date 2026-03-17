abstract class Shape1{
    void disp() {
        System.out.println("this is a shape");}
    abstract void draw();
}
    interface Polygon {
    void sides();
}
class Triangle1 extends Shape1 implements Polygon {
    void draw() {
        System.out.println("Drawing triangle");
    }
    public void sides() {
        System.out.println("Triangle has 3 sides");
    }
}
class Circle1 extends Shape1{
    void draw() {
        System.out.println("Drawing triangle");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        Triangle1 t = new Triangle1();
        //Shape1 t=new Traingle1();
        t.disp();    // from Shape (abstract class)
        t.draw();    // overridden method
        t.sides();
        Circle1 c=new Circle1();
        c.disp();    // from Shape (abstract class)
        c.draw();    //overridden method
    }
}
