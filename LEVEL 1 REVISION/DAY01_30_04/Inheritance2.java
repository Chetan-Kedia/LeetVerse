package leetverseS2;

class Animal3 {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog3 extends Animal3 {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Puppy extends Dog3 {
    void weep() {
        System.out.println("Puppy is weeping");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        Puppy p = new Puppy();

        p.eat();   // from Animal
        p.bark();  // from Dog
        p.weep();  // own
    }
}
