package leetverseS2;

interface Animal4 {
    void eat();
}

interface Pet {
    void play();
}

class Dog4 implements Animal4, Pet {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void play() {
        System.out.println("Dog is playing");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Dog4 d = new Dog4();
        d.eat();
        d.play();
    }
}
