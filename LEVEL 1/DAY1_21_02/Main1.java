class Student1 {
    int id;
    String name;
    Student1(){
        System.out.println("student1 constructor called");
    }
    Student1(int i, String n) {
        id = i;
        name = n;
        System.out.println("parameterized constructor called");
    }
    // method
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}
public class Main1 {
    public static void main(String[] args) {
        // object creation
        Student1 s = new Student1();
        Student1 s1 = new Student1(101, "Sneha");
        // calling method
        s1.display();
    }
}