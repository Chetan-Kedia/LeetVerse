class Human {
    void eat() {
        System.out.println("Human is eating");
    }
}
class Student extends Human {
    void study() {
        System.out.println("Student is studying");
    }
}
class EngineeringStudent extends Student {
    void code() {
        System.out.println("Engineering student is coding");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.eat();    // from Human
        es.study();  // from Student
        es.code();   // own
    }
}