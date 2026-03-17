class PriorityExample extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName() +
                " Priority: " + Thread.currentThread().getPriority());
    }
    public static void main(String[] args) {

        PriorityExample t1 = new PriorityExample(); //Thread 1
        PriorityExample t2 = new PriorityExample(); //Thread 2
        PriorityExample t3 = new PriorityExample();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t3.setPriority(Thread.NORM_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
    }
}