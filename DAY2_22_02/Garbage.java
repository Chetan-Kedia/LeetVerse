package leetverse;

public class Garbage {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        s = null;
        s.display();
    }
}
class Student {
    int id;
    String name;
    // constructor
    Student() {
        id = 1;
        name = "Sneha";
        System.out.println("Student object created");
    }
    // method
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
