package inner_class;

class Outer {
    private String message = "Hello from Outer";

    // 1. Non-static Inner Class
    class Inner {
        void display() {
            System.out.println(message);
        }
    }

    // 2. Static Nested Class
    static class StaticInner {
        void show() {
            System.out.println("Inside static nested class");
            // System.out.println(message);
        }
    }

    void methodExample() {
        // 3. Local Inner Class
        class LocalInner {
            void print() {
                System.out.println("Inside local inner class");
            }
        }
        LocalInner obj = new LocalInner();
        obj.print();
    }
}

public class Main {
    public static void main(String[] args) {

        // Non-Static Inner Class
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        inner.display();

        // Static Nested Class
        Outer.StaticInner staticInner = new Outer.StaticInner();
        staticInner.show();

        // Local Inner Class
        outer.methodExample();

        // 4. Anonymous Inner Class
        Runnable r = new Runnable() {
            public void run() {
                System.out.println("Inside anonymous inner class");
            }
        };
        r.run();
    }
}
