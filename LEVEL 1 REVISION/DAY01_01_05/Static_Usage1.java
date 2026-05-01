package static_usage;

class Test {
    // static method
    int a = 10;
    static void show() {
        System.out.println("Hello from static method");
        // System.out.println(a);
    }

    // non-static method
    void showInstance() {
        System.out.println("Hello from instance method");
        System.out.println(a);
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        // static method usage
        Test.show();

        // non static method usage
        // Test.showInstance();
        Test test = new Test();
        test.showInstance();
    }
}
