class Test {
    synchronized void show() {
        try {
            System.out.println("Waiting...");
            wait();
        } catch (Exception e) {}
        System.out.println("Resumed");
    }
    synchronized void notifyThread() {
        System.out.println("Notifying...");
        notify();
    }
}
class MyThread1 extends Thread {
    Test t;
    MyThread1(Test t) {
        this.t = t;
    }
    public void run() {
        t.show();
    }
}
class MyThread2 extends Thread {
    Test t;
    MyThread2(Test t) {
        this.t = t;
    }
    public void run() {
        t.notifyThread();
    }
}
class InterThread {
    public static void main(String args[]) {
        Test t = new Test();
        MyThread1 t1 = new MyThread1(t);
        MyThread2 t2 = new MyThread2(t);
        t1.start();
        t2.start();
    }
}