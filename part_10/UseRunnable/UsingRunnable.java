package part_10.UseRunnable;

public class UsingRunnable implements Runnable {
    // Create an application that demonstrates how to create threads by implementing
    // the runnable interface

    Thread thrd;

    public UsingRunnable(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    @Override
    public void run() {

        System.out.println("Thread " + this.thrd.getName() + " is running." );
    }

}
