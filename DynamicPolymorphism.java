class Human {
    void work() {
        System.out.println("Human works");
    }

    void eat() {
        System.out.println("Human eats");
    }
}
class Doctor extends Human {
    void work() {
        System.out.println("Doctor treats patients");
    }
    void eat() {
        System.out.println("Human eats medicine");
    }
}

class Engineer extends Human {
    void work() {
        System.out.println("Engineer writes code");
    }
}
public class DynamicPolymorphism {
    public static void main(String[] args) {
        Human h;
        h = new Human();
        h.work();
        h.eat();

        System.out.println();

        // Doctor object (Runtime Polymorphism)
        h = new Doctor();
        h.work();   // overridden method
        h.eat();    // inherited method

        System.out.println();

        // Engineer object (Runtime Polymorphism)
        h = new Engineer();
        h.work();   // overridden method
        h.eat();    // inherited method
    }
}