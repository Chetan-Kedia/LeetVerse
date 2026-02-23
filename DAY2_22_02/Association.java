class Pen {
    void write() {
        System.out.println("Writing...");
    }
}
class Person {
    void study() {
        Pen p= new Pen();
        p.write();
    }
}
public class Association {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.study();
        //person uses/has a pen and then after writing, no more requirement of pen
    }
}
