class A{
    void f1(){
        System.out.println("Class A");
    }
}
class B extends A{
    void f1(){
        System.out.println("Class B");
    }
    void f1(int a){
        System.out.println("int: " + a);
    }
}

class Questions{
    public static void main(String[] args) {
        A obj1 = new A();
        A obj2 = new B();
        obj1.f1();
        obj2.f1();

        //obj2.f1(5); 

        B obj3 = new B();
        obj3.f1(5);
    }
}
