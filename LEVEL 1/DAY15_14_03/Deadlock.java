class A {}
class B {}
class Deadlock {
    A a = new A();
    B b = new B();
    Thread t1 = new Thread() {
        public void run() {
            synchronized(a) {
                System.out.println("Thread1 locked A");

                synchronized(b) {
                    System.out.println("Thread1 locked B");
                }
            }
        }
    };
    Thread t2 = new Thread() {
        public void run() {
            synchronized(a) {
                System.out.println("Thread2 locked B");
                synchronized(b) {
                    System.out.println("Thread2 locked A");
                }
            }
        }
    };
    public static void main(String args[]) {
        Deadlock d = new Deadlock();
        d.t1.start();
        d.t2.start();
    }
}