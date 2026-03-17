class Human {
    void eat() {
        System.out.println("Human is eating");
    }
    void sleep() {
        System.out.println("Human is sleeping");
    }
}
class Doctor extends Human {
    void treatPatients() {
        System.out.println("Doctor is treating patients");
    }
}
public class Single {
    public static void main(String[] args) {
        Doctor d = new Doctor();

        d.eat();            // inherited
        d.sleep();          // inherited
        d.treatPatients();  // own
    }
}