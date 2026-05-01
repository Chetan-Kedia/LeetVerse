class Animal{
    void noise(){}
}
class Cat extends Animal{
    void noise(){
        System.out.println("Meow");
    }
}
class Dog extends Animal{
    void noise(){
        System.out.println("Barks");
    }
}
class Overriding{
    public static void main(String[] args) {
        Animal cat = new Cat();
        Animal dog = new Dog();
        cat.noise();
        dog.noise();
    }
}
