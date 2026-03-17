class DaemonTry extends Thread
{
    public void run()
    {
        System.out.println(isDaemon());
    }
    public static void main(String args[])throws InterruptedException
    {
        DaemonTry t = new DaemonTry();
        t.setDaemon(true);
        t.start();
        Thread.sleep(100);
    }
}